package com.guigu.instructional.classinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.classinfo.mapper.ClassInfoMapper;
import com.guigu.instructional.classinfo.service.ClassInfoService;
import com.guigu.instructional.po.ClassInfo;
import com.guigu.instructional.po.ClassInfoExample;
import com.guigu.instructional.po.ClassInfoExample.Criteria;
@Service("classInfoServiceImpl")
public class ClassInfoServiceImpl implements ClassInfoService{
	
	@Resource(name="classInfoMapper")
	private ClassInfoMapper classInfoMapper;
	
	@Override
	public boolean addClass(ClassInfo classInfo) {
		try {
            int i = classInfoMapper.insertSelective(classInfo);
            if (i > 0) {
                return true;
            }
        } catch (Exception e) {

        }
		return false;
	}

	@Override
	public boolean updateClass(ClassInfo classInfo) {
		try {
            int i = classInfoMapper.insertSelective(classInfo);
            if (i > 0) {
                return true;
            }
        } catch (Exception e) {

        }
		return false;
	}

	@Override
	public List<ClassInfo> getClassInfoList(ClassInfo classInfo) {
		ClassInfoExample classInfoExample=new ClassInfoExample();
		Criteria criteria=classInfoExample.createCriteria();
		
		if(classInfo!=null) {
			if(classInfo.getClassId()!=null) {
				criteria.andClassIdEqualTo(classInfo.getClassId());
			}
			if(classInfo.getClassName()!=null) {
				classInfo.setClassName("%"+classInfo.getClassName()+"%");
				criteria.andClassNameLike(classInfo.getClassName());
			}
		}
		criteria.andClassStateEqualTo("1");
		
		return classInfoMapper.selectByExample(classInfoExample);
	}

	@Override
	public ClassInfo getClassInfo(Integer classId) {
		
		return classInfoMapper.selectByPrimaryKey(classId);
	}

}
