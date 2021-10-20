package senpiper.assignment.dto;

import java.util.List;

import senpiper.assignment.entity.Address;

public class CenterDto {
	
	private String centerName;
	
	private String centerCode;
	
	private Address address;
	
	private int studentCapacity;

	private List<String> courses;
	
	private long createdOn;
	
	private String email;
	
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


	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public long getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(long createdOn) {
		this.createdOn = System.currentTimeMillis();
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
		return "Center [centerName=" + centerName + ", centerCode=" + centerCode + ", address=" + address
				+ ", studentCapacity=" + studentCapacity + ", courses=" + courses + ", createdOn=" + createdOn
				+ ", email=" + email + ", phone=" + phone + "]";
}
}
