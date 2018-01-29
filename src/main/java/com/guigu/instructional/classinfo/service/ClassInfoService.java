package com.guigu.instructional.classinfo.service;

import java.util.List;

import com.guigu.instructional.po.ClassInfo;

public interface ClassInfoService {
	public boolean addClass(ClassInfo classInfo);
    
    public boolean updateClass(ClassInfo classInfo);
    
    public List<ClassInfo> getClassInfoList(ClassInfo classInfo);
    
    public ClassInfo getClassInfo(Integer classId);
    
}
