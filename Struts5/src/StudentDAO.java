package Struts5;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	public Boolean saveForm(StudentBean sb) throws ClassNotFoundException,IOException 
	{

        try
       {
        	Class.forName("oracle.jdbc.driver.OracleDriver");
	   } 
       catch (ClassNotFoundException ex) 
        {
	        Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
		
	    try 
	    {
	        	 
	        	 Connection con;
	            con = DriverManager.getConnection("jdbc:oracle:thin:@apollo.ite.gmu.edu:1521:ite10g", "krachako", "raptix");
	            System.out.println("Connection established");
	            
	            //create table Student(studentid varchar(30),fname varchar(30),lname varchar(30),username varchar(30),address varchar(30),city varchar(30),state varchar(30),pincode integer,email varchar(30),phoneno varchar(30),url varchar(30),sdate date,month varchar(30),year integer,interested varchar(30),likeness varchar(30),campus varchar(30),comments varchar(30));//

	            String sql = "insert into student values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	            System.out.println("Connection established");
	            
	            PreparedStatement prepared = con.prepareStatement(sql);
	            System.out.println("Connection established");
	            prepared.setString(1, sb.getstudentid());
	            prepared.setString(2, sb.getfname());
	            prepared.setString(3, sb.getlname());
	            prepared.setString(4, sb.getusername());
	            prepared.setString(5, sb.getAddress());
	            prepared.setString(6, sb.getcity());
	            prepared.setString(7, sb.getstate());
	            prepared.setString(8, sb.getpincode());
	            prepared.setString(9, sb.getemail());
	            prepared.setString(10, sb.getphoneno());
	            prepared.setString(11, sb.geturl());
	            prepared.setString(12, sb.getdate());
	            prepared.setString(13, sb.getmonth());
	            prepared.setString(14, sb.getyear());
	            prepared.setString(15, sb.getinterested());
	            prepared.setString(16, sb.getlikeness());
	            prepared.setString(17, sb.getcampus());
	            prepared.setString(18, sb.getcomments());
	            
	            
	            int status=prepared.executeUpdate();
	            con.close();
	            if(status>0)
	    			return true;
	    		else 
	    			return false;
	             
	    }
	    catch (Exception ex) 
        {
	        Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
		return null;
		
	        
	}
	
	 @SuppressWarnings("resource")
	    public StudentBean retrieveForm(String id) {
	        StudentBean stud_bean = new StudentBean();
	 System.out.println("entered");
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");

	            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@apollo.ite.gmu.edu:1521:ite10g", "krachako", "raptix");
	            Statement stmt = con.createStatement();
	            System.out.println("connection established");
	            System.out.println(id);
	            id="'"+id+"'";
	            System.out.println("Select * from student where studentid =" + id);
	            ResultSet result = stmt.executeQuery("Select * from student where studentid =" + id);
	            
	            while (result.next()) {
	            	System.out.println("entered retirieve");
	                stud_bean.setstudentid(result.getString(1));
	                stud_bean.setfname(result.getString(2));
	                stud_bean.setlname(result.getString(3));
	                stud_bean.setusername(result.getString(4));
	                stud_bean.setAddress(result.getString(5));
	                stud_bean.setcity(result.getString(6));
	                stud_bean.setstate(result.getString(7));
	                stud_bean.setpincode(result.getString(8));
	                stud_bean.setemail(result.getString(9));
	                stud_bean.setphoneno(result.getString(10));
	                stud_bean.seturl(result.getString(11));
	                stud_bean.setdate(result.getString(12));
	                stud_bean.setmonth(result.getString(13));
	                stud_bean.setyear(result.getString(14));
	                stud_bean.setinterested(result.getString(15));
	                stud_bean.setlikeness(result.getString(16));
	                stud_bean.setcampus(result.getString(17));
	                stud_bean.setcomments(result.getString(18));
	                	                
	                
	                System.out.println("fininshed retirieve");


	            }
	            System.out.println("exit");
	            System.out.println(stud_bean.getlikeness());
	            con.close();
	           
	        } catch (Exception e) {
	        }
	        
       return stud_bean; 
	    }

	 public List<String> getStudentIds() throws SQLException, ClassNotFoundException
		{
			List<String> Ids=new ArrayList<String>();
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@apollo.vse.gmu.edu:1521:ite10g","krachako","raptix");  
			String sql="select studentid from Student_details";
			Statement statement=con.createStatement();
			ResultSet resultSet=statement.executeQuery(sql);
			while(resultSet.next())
			{
				Ids.add(resultSet.getString(1));
			}
			
			return Ids;
		}

}
