package senpiper.assignment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

//this class will map to the center table in the database
@Entity
public class Center {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message = " CenterName is mandatory")
	@Size(max = 40 , message = "Maximum center name length : 40")
	private String centerName;
	
	@NotBlank(message = "Center Code is mandatory")
	@Size(min = 12, max = 12, message = "Center Code must be of exactly 12 alphanumeric characters")
	@Pattern(regexp = "^[a-zA-Z0-9]+$",message="must be alphanumeric")  
	private String centerCode;
	
	@NotNull
	@OneToOne
	private Address address;
	
	private int studentCapacity;

	
	private String courses;
	
	private long createdOn;
	
	
//	@Pattern(regexp="(^[a-zA-Z0-9_\-\.]+)",message = "Mobile Number invalid")
	
	@Email(message = "invalid email id")
	private String email;
	
	
	@Pattern(regexp="(^[0-9]{10})",message = "Mobile Number invalid")
	private String phone;

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getCenterCode() {
		return centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getStudentCapacity() {
		return studentCapacity;
	}

	public void setStudentCapacity(int studentCapacity) {
		this.studentCapacity = studentCapacity;
	}


	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(long createdOn) {
		this.createdOn = createdOn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Center [id=" + id + ", centerName=" + centerName + ", centerCode=" + centerCode + ", address=" + address
				+ ", studentCapacity=" + studentCapacity + ", courses=" + courses + ", createdOn=" + createdOn
				+ ", email=" + email + ", phone=" + phone + "]";
	}


	
	
	
}
