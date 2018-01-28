package com.guigu.instructional.system.service;

import java.util.List;

import com.guigu.instructional.po.StaffInfo;
import com.guigu.instructional.po.StaffTeachers;

/**       
 * <p>project_name:InstructionalManagement</p>
 * <p>package_name:com.guigu.instructional.system.service.StaffInfoService</p>
 * <p>description��</p>
 * <p>@author������ʦ<p>   
 * <p> date:2018��1��26������8:55:29 </p>
 * <p>comments��    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */

public interface StaffInfoService {
    
    /**
     * addStaff:���Ա����Ϣ
     * @author ����ʦ
     * @param staffInfo
     * @return  <br/> 
     * @since JDK 1.8
     */
    public boolean addStaff(StaffInfo staffInfo);
    
    /**
     * updateStaff:����Ա������
     * @author ����ʦ
     * @param staffInfo
     * @return  <br/>
     * @since JDK 1.8
     */
    public boolean updateStaff(StaffInfo staffInfo);
    
    /**
     * getStaffInfo:����������ѯԱ����Ϣ
     * @author ����ʦ
     * @param staffInfo
     * @return  <br/>
     * @since JDK 1.8
     */
    public List<StaffInfo> getStaffInfoList(StaffInfo staffInfo);
    
    
    /**
     * getStaffInfo:����Ա����Ų�ѯԱ����Ϣ
     * @author ����ʦ
     * @param staffId
     * @return  <br/>
     * @since JDK 1.8
     */
    public StaffInfo getStaffInfo(Integer staffId);
    
    public List<StaffTeachers> findStaffTeachers(StaffInfo staffInfo)throws Exception;
}


