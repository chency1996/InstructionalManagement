package com.guigu.instructional.payment.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.payment.mapper.StudentPaymentMapper;
import com.guigu.instructional.payment.service.StudentPaymentService;
import com.guigu.instructional.po.StudentPayment;


@Service("StudentPaymentServiceImpl")
public class StudentPaymentServiceImpl implements StudentPaymentService{

	@Resource(name ="studentPaymentMapper")
	private StudentPaymentMapper studentPaymentMapper;
	
	@Override
	public boolean addStudentPayment(StudentPayment studentPayment) {
		try {
            int i = studentPaymentMapper.insertSelective(studentPayment);
            if (i > 0) {
                return true;
            }
        } catch (Exception e) {

        }

        return false;
	}

	@Override
	public boolean updateStudentPayment(StudentPayment studentPayment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<StudentPayment> getStudentPayment(StudentPayment StudentPayment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentPayment getStudentPayment(Integer paymentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
