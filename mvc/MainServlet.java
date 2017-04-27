package kalyani;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet(name = "MainServlet", urlPatterns = {"/MainServlet"})
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 7840550800351066998L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StudentDAO StuObj_1 = new StudentDAO();
		String ID=request.getParameter("id");
		System.out.println(ID);
		StudentBean stu_bean_1=StuObj_1.retrieveForm(ID);
		HttpSession session = request.getSession();
		session.setAttribute("studentdetails", stu_bean_1);
		request.setAttribute("pid" , ID);
		String address1;
		if (stu_bean_1 != null)
		{  address1 = "StudentDetails.jsp";}
		else
		{
			address1= "NoSuchStudent.jsp";
		}
		 
		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher(address1);
		dispatcher.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDAO StuObj= new StudentDAO();
		StuObj.saveForm(request);
		float mean;
		double stdDev;
		String dataValues=request.getParameter("data");
		DataProcessor data_proc=new DataProcessor();
		mean=data_proc.Mean_Calc(dataValues);
		stdDev=data_proc.sdcalculation(dataValues,mean);
		DataBean data_bean=new DataBean();
		data_bean.setMean(mean);
		data_bean.setStandardDeviation(stdDev);

		String id_string="";
		 try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");

	            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@apollo.ite.gmu.edu:1521:ite10g", "krachako", "raptix");
	            Statement stmt = con.createStatement();
	            ResultSet result = stmt.executeQuery("Select student_Id from Student_Details");
	            while (result.next()) {
	                id_string=id_string+result.getString(1)+",";
	            }
	            
	            con.close();
	           
	        } catch (Exception e) {
	        }
		 String[] id_list = id_string.split(",");
	
		request.setAttribute("id_jsp", id_list);
			HttpSession session = request.getSession();
			session.setAttribute("data_bean1", data_bean);			
			
			RequestDispatcher dispatcher;
		String address;
			if (data_bean.getMean() >= 90) {
				address = "WinnerAcknowledgement.jsp";
			} else {
				address = "SimpleAcknowledgement.jsp";
			}

			dispatcher = request.getRequestDispatcher(address);
			dispatcher.forward(request, response);	
	}
	

}
