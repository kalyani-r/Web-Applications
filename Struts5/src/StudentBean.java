// Kalyani Rachakonda
//provide getters and setters for the data objects 
package Struts5;

public class StudentBean {
	private String studentid ;
	private String fname;
	private String lname;
	private String username ;
	private String address;
	private String city;
	private String state;
	private String pincode;
	private String phoneno;
	private String email;
	private String url;
	private String date;
	private String interested;
	private String likeness;
	private String campus;
	private String comments;
	private String month;
	private String year;
	private String data;
	
	public String getstudentid()  {
        return studentid ;
    }

    public void setstudentid (String studentid ) {
        this.studentid  = studentid ;
    }

    public String getfname() {
        return fname;
    }

    public void setfname(String fname) {
        this.fname = fname;
    }
    
   
    public String getlname() {
        return lname;
    }

    public void setlname(String lname) {
        this.lname = lname;
    }
	
    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    public String getcity() {
        return city;
    }

    public void setcity(String city) {
        this.city = city;
    }

    public String getstate() {
        return state;
    }

    public void setstate(String state) {
        this.state = state;
    }

    public String getpincode() {
        return pincode;
    }

    public void setpincode(String pincode) {
        this.pincode = pincode;
    }

    public String getphoneno() {
        return phoneno;
    }

    public void setphoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String geturl() {
        return url;
    }

    public void seturl(String url) {
        this.url = url;
    }

    public String getdate() {
        return date;
    }
    public void setdate(String date) {
        this.date = date;
    }
    
    public String getinterested() {		//interested in university
        return interested;
    }
    public void setinterested(String interested) {	//interested in university
    	
        this.interested = interested;
    }

    public String getlikeness() {		//recommend to friends
        return likeness;
    }

    public void setlikeness(String likeness) {		//recommend to friends
        this.likeness = likeness;
    }
    
    public String getcampus() {			//like about campus
        return campus;
    }

    public void setcampus(String campus) {		//like about campus
        this.campus = campus;
    }
	
	public String getcomments() {
        return comments;
    }

    public void setcomments(String comments) {
        this.comments = comments;
    }
	public String getmonth() {
        return month;
    }
    public void setmonth(String month) {
        this.month = month;
    }
	public String getyear() {
        return year;
    }

    public void setyear(String year) {
        this.year = year;
    }
    
    public String getData()
    {
    	return data;
    }
    
    public void setData(String data)
    {
    	this.data=data;
    }
}
