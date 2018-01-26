package com.guigu.instructional.payment.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.payment.service.StudentPaymentService;
import com.guigu.instructional.po.StaffInfo;
import com.guigu.instructional.po.StudentPayment;

@Controller
@RequestMapping("/payment/studentpayment/")
public class StudentPaymentController {
	
	
	@Resource(name="StudentPaymentServiceImpl")
	private StudentPaymentService studentPaymentService;
	
	   @RequestMapping("add.action")
	    public String addStaffInfo(StudentPayment studentPayment,Model model) {
	       
	       boolean result= studentPaymentService.addStudentPayment(studentPayment);
	       if(result) {
	           model.addAttribute("info","success");
	       }else {
	           model.addAttribute("info","Failure");
	       }
	       
	       System.err.println(studentPayment);
	       return null;
	       
	    }

}
