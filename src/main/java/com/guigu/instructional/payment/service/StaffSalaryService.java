package com.guigu.instructional.payment.service;

import java.util.List;

import com.guigu.instructional.po.StaffSalary;



public interface StaffSalaryService {


	
    public boolean addStaffSalary(StaffSalary staffSalary);
    

    public boolean updateStaffSalary(StaffSalary staffSalary);
    

    public List<StaffSalary> getStaffSalary(StaffSalary staffSalary);
    
   
    public StaffSalary getStaffSalary(Integer staffSalaryId);
    
    public boolean deleteStaffSalary(Integer staffSalaryId);
	
}
