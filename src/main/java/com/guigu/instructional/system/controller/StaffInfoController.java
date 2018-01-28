package com.guigu.instructional.system.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebParam.Mode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.po.StaffInfo;
import com.guigu.instructional.po.StaffTeachers;
import com.guigu.instructional.system.service.StaffInfoService;

/**
 * <p>
 * project_name:InstructionalManagement
 * </p>
 * <p>
 * package_name:com.guigu.instructional.system.controller.StaffInfoController
 * </p>
 * <p>
 * description��
 * </p>
 * <p>
 * @author������ʦ
 * <p>
 * <p>
 * date:2018��1��26������9:15:58
 * </p>
 * <p>
 * comments��
 * </p>
 * <p>
 * @version jdk1.8
 * </p>
 * 
 * <p>
 * Copyright (c) 2018, 980991634@qq.com All Rights Reserved.
 * </p>
 */
@Controller
@RequestMapping("/system/staffinfo/")
public class StaffInfoController {

	@Resource(name = "staffInfoServiceImpl")
	private StaffInfoService staffInfoService;

	@RequestMapping("add.action")
	public String addStaffInfo(StaffInfo staffInfo, Model model) {
		staffInfo.setStaffState("1");
		boolean result = staffInfoService.addStaff(staffInfo);
		if (result) {
			model.addAttribute("info", "��ӳɹ�");
		} else {
			model.addAttribute("info", "���ʧ��");
		}
		return this.list(null, model);

	}

	@RequestMapping("list.action")
	public String list(StaffInfo staffInfo, Model model) {
		List<StaffInfo> list = staffInfoService.getStaffInfoList(staffInfo);
		model.addAttribute("list", list);
		return "system/staffinfo/staffinfo_list";
	}

	@RequestMapping("teacherlist.action")
	public String teacherlist(StaffInfo staffInfo, Model model) throws Exception {
		List<StaffTeachers> list = staffInfoService.findStaffTeachers(staffInfo);
		model.addAttribute("list", list);
		return "classinfo/teacher/teacher_list";
	}

	@RequestMapping("show.action")
	public String showStaffInfo(Integer staffId, Model model) {
		StaffInfo staffInfo = staffInfoService.getStaffInfo(staffId);
		model.addAttribute("staffInfo", staffInfo);
		return "system/staffinfo/staffinfo_show";

	}

	@RequestMapping("load.action")
	public String loadUpate(Integer staffId, Model model) {
		StaffInfo staffInfo = staffInfoService.getStaffInfo(staffId);
		model.addAttribute("staffInfo", staffInfo);
		return "system/staffinfo/staffinfo_update";
	}
	
	@RequestMapping("teacherload.action")
	public String teacherloadUpate(Integer staffId, Model model) {
		StaffInfo staffInfo = staffInfoService.getStaffInfo(staffId);
		model.addAttribute("staffInfo", staffInfo);
		return "classinfo/teacher/teacher_update";
	}

	@RequestMapping("update.action")
	public String updateStaffInfo(StaffInfo staffInfo, Model model) {
		boolean result = staffInfoService.updateStaff(staffInfo);
		if (result) {
			model.addAttribute("info", "�޸ĳɹ�");
		} else {
			model.addAttribute("info", "�޸�ʧ��");
		}
		return this.list(null, model);
	}

	@RequestMapping("delete.action")
	public String deleteStaffInfo(StaffInfo staffInfo, Model model) {

		// ����Ա��Ϊ 0 ������Ч
		staffInfo.setStaffState("0");

		boolean result = staffInfoService.updateStaff(staffInfo);
		if (result) {
			model.addAttribute("info", "ɾ���ɹ�");
		} else {
			model.addAttribute("info", "ɾ��ʧ��");
		}
		return this.list(null, model);
	}

}
