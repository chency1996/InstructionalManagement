package com.guigu.instructional.po;

public class StudentPaymentCustom extends StudentPayment{

	 public String getStaffName() {
		return staffName;
	}

	public StudentPaymentCustom() {
		super();
	}

	public StudentPaymentCustom(String staffName, String studentName) {
		super();
		this.staffName = staffName;
		this.studentName = studentName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	private String staffName;
	 
	 private String studentName;
	
}
