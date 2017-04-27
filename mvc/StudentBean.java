package kalyani;

public class StudentBean {
	private String student_id ;
	private String name;
	private String address;
	private String city;
	private String state;
	private String zip_code;
	private String phone;
	private String email_id;
	private String url;
	private String date1;
	private String things;
	private String know_about;
	private String comments;
	private String month;
	private String year;
	private String likely;
	
	public String getLikely() {
        return likely;
    }

    public void setLikely(String likely) {
        this.likely = likely;
    }
	
	public String getYear() {
        return year;
    }
	
	public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
	public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
	public String getKnowAbout() {
        return know_about;
    }

    public void setKnowAbout(String know_about) {
        this.know_about =know_about;
    }
    
	public String getThings() {
        return things;
    }

    public void setThings(String temp) {
    	
        this.things = temp;
    }
    public String getDate1() {
        return date1;
    }

    public void setDate1(String date) {
        this.date1 = date;
    }
    
    public String getURL() {
        return url;
    }

    public void setURL(String url) {
        this.url = url;
    }

    public String getEmail_ID() {
        return email_id;
    }

    public void setEmail_ID(String email_id) {
        this.email_id = email_id;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getZip_Code() {
        return zip_code;
    }

    public void setZip_Code(String zip_code) {
        this.zip_code = zip_code;
    }
    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	
	public String getStudent_ID()  {
        return student_id ;
    }


    public void setStudent_ID (String student_id ) {
        this.student_id  = student_id ;
    }
}