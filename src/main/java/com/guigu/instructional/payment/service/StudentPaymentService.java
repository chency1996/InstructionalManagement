package com.guigu.instructional.payment.service;

import java.util.List;

import com.guigu.instructional.po.StudentPayment;

public interface StudentPaymentService {

	
	    public boolean addStudentPayment(StudentPayment studentPayment);
	    
	
	    public boolean updateStudentPayment(StudentPayment studentPayment);
	    
	
	    public List<StudentPayment> getStudentPayment(StudentPayment StudentPayment);
	    
	   
	    public StudentPayment getStudentPayment(Integer paymentId);
	    
	    
	}
	
	
	
	
	
	

