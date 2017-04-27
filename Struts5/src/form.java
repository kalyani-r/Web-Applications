package Struts5;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import Struts5.DataBean;
import Struts5.DataProcessor;
import Struts5.StudentBean;
import Struts5.StudentDAO;

public class form extends ActionSupport implements ModelDriven<StudentBean>
{
	private static final long serialVersionUID = 1L;

	private StudentBean studentBean=new StudentBean();
	private DataBean dataBean = new DataBean();
	private String Id;
	private List<String> studentIds = new ArrayList<String>();


	public List<String> getStudentIds() {
		return studentIds;
	}

	public void setStudentIds(List<String> studentIds) {
		this.studentIds = studentIds;
	}

	public String execute() throws Exception 
	{
		System.out.println("Inside Execute");
		StudentDAO studentDAO = new StudentDAO();
		Boolean status = studentDAO.saveForm(studentBean);
		studentIds = studentDAO.getStudentIds();
		DataProcessor dp1 = new DataProcessor();
		dataBean = dp1.calculateData(studentBean.getData());
		
				if(status) 
				{
					if(dataBean.getMean()>90.0)
					{
						return "Winner";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
					}
					else
					{
						return "Simple";
					}
				}
				return ERROR;
		
	}

	public String getMethod() throws ClassNotFoundException, SQLException {
		StudentDAO studentDAO = new StudentDAO();
		studentBean = studentDAO.retrieveForm(Id);
		return "studentinfopage";
	}

	public StudentBean getStudentBean() {
		return studentBean;
	}

	public void setStudentBean(StudentBean studentBean) {
		this.studentBean = studentBean;
	}

	public DataBean getDataBean() {
		return dataBean;
	}

	public void setDataBean(DataBean dataBean) {
		this.dataBean = dataBean;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}


	public StudentBean getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}
