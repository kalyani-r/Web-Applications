package kalyani;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



import kalyani.StudentBean;

@WebServlet(name = "SWE642Assignment4", urlPatterns = {"/SWE642Assignment4"})

public class StudentDAO {
	public void saveForm(HttpServletRequest request) throws ServletException,
    IOException {

		    String name = request.getParameter("fname");
	        String studentID = request.getParameter("s_id");
	        String address = request.getParameter("addr");
	        String pno = request.getParameter("ph_no");
	        String comments = request.getParameter("comments");
	        String month = request.getParameter("month");
	        String year = request.getParameter("year");
	        String likely = request.getParameter("likelihood");
	        String email = request.getParameter("email");
	        String url = request.getParameter("url");
	        String date1 = request.getParameter("date1");
	        String city = request.getParameter("city");
	        String state = request.getParameter("state");
	        String zip = request.getParameter("zip");
	        String[] thingsliked = request.getParameterValues("things_liked");
	        String howtosite = request.getParameter("aware");

	        String temp="";
	        StudentBean studentBean = new StudentBean();
	        
	       
	        studentBean.setStudent_ID(studentID);
	        studentBean.setName(name);
	        studentBean.setAddress(address);
	        studentBean.setCity(city);
	        studentBean.setState(state);
	        studentBean.setZip_Code(zip);
	        studentBean.setPhone(pno);
	        studentBean.setEmail_ID(email);
	        studentBean.setURL(url);
	        studentBean.setDate1(date1);
	        for (int i = 0; i < thingsliked.length; i++) {
                temp = temp + thingsliked[i] + " ";
            }
	        studentBean.setThings(temp);
	        studentBean.setComments(comments);
	        studentBean.setKnowAbout(howtosite);
	        studentBean.setMonth(month);
	        studentBean.setYear(year);
	        studentBean.setLikely(likely);
	      
	        try
		       {
		    	   Class.forName("oracle.jdbc.driver.OracleDriver");
	    } catch (ClassNotFoundException ex) {
	        Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
		
	       
	        	        
	        try {
	        	 
	        	 Connection con;
	            con = DriverManager.getConnection("jdbc:oracle:thin:@apollo.ite.gmu.edu:1521:ite10g", "krachako", "raptix");
	            
	            


	            String sql = "insert into Student_Details values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	         
	           
	            PreparedStatement persist_db = con.prepareStatement(sql);
	            persist_db.setString(1, studentBean.getStudent_ID());
	            persist_db.setString(2, studentBean.getName());
	            persist_db.setString(3, studentBean.getAddress());
	            persist_db.setString(4, studentBean.getCity());
	            persist_db.setString(5, studentBean.getState());
	            persist_db.setString(6, studentBean.getZip_Code());
	            persist_db.setString(7, studentBean.getPhone());
	            persist_db.setString(8, studentBean.getEmail_ID());
	            persist_db.setString(9, studentBean.getURL());
	            persist_db.setString(10, studentBean.getDate1());
	            persist_db.setString(11, studentBean.getComments());
	            persist_db.setString(12, studentBean.getMonth());
	            persist_db.setString(13, studentBean.getYear());
	            persist_db.setString(14, studentBean.getLikely());
	            
	           
	              persist_db.executeUpdate();
	              persist_db.close();
	            if (con != null) {
	                con.close();
	            }
	        } catch (SQLException ex) {
	            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
	        }


	        
	}
	
	 @SuppressWarnings("resource")
	    public StudentBean retrieveForm(String id) {
	        StudentBean studentBean = new StudentBean();

	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");

	            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@apollo.ite.gmu.edu:1521:ite10g", "krachako", "raptix");
	            Statement stmt = con.createStatement();
	            id="'"+id+"'";
	            ResultSet result = stmt.executeQuery("Select * from Student_Details where STUDENT_ID =" + id);
	            
	            while (result.next()) {
	                studentBean.setStudent_ID(result.getString(1));
	                studentBean.setName(result.getString(2));
	                studentBean.setAddress(result.getString(3));
	                studentBean.setCity(result.getString(4));
	                studentBean.setState(result.getString(5));
	                studentBean.setZip_Code(result.getString(6));
	                studentBean.setPhone(result.getString(7));
	                studentBean.setEmail_ID(result.getString(8));
	                studentBean.setURL(result.getString(9));
	                studentBean.setDate1(result.getString(10));
	                studentBean.setComments(result.getString(11));
	                studentBean.setMonth(result.getString(12));
	                studentBean.setYear(result.getString(13));	                
	                studentBean.setLikely(result.getString(14));
	          
	            }
	            con.close();
	           
	        } catch (Exception e) {
	        }
	        
       return studentBean; 
	    }


}
