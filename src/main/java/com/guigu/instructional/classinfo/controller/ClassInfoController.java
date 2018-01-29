package com.guigu.instructional.classinfo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.classinfo.service.ClassInfoService;
import com.guigu.instructional.po.ClassInfo;

@Controller
@RequestMapping("/classinfo/classinfo/")
public class ClassInfoController {

	@Resource(name = "classInfoServiceImpl")
	private ClassInfoService classInfoService;

	@RequestMapping("add.action")
	public String addClassInfo(ClassInfo classInfo, Model model) {
		classInfo.setClassState("1");
		boolean result = classInfoService.addClassInfo(classInfo);
		if (result) {
			model.addAttribute("info", "successful");
		} else {
			model.addAttribute("info", "fault");
		}
		return this.list(null, model);

	}

	@RequestMapping("list.action")
	public String list(ClassInfo classInfo, Model model) {
		List<ClassInfo> list = classInfoService.getClassInfoList(classInfo);
		model.addAttribute("list", list);
		return "classinfo/classinfo/classinfo_list";
	}

	@RequestMapping("show.action")
	public String showclassInfo(Integer classId, Model model) {
		ClassInfo classInfo = classInfoService.getClassInfo(classId);
		model.addAttribute("classInfo", classInfo);
		return "classinfo/classinfo/classinfo_show";

	}

	@RequestMapping("load.action")
	public String loadUpate(Integer classId, Model model) {
		ClassInfo classInfo = classInfoService.getClassInfo(classId);
		model.addAttribute("classInfo", classInfo);
		return "classinfo/classinfo/classinfo_update";
	}

	@RequestMapping("teacherload.action")
	public String teacherloadUpate(Integer classId, Model model) {
		ClassInfo classInfo = classInfoService.getClassInfo(classId);
		model.addAttribute("classInfo", classInfo);
		return "classinfo/teacher/teacher_update";
	}

	@RequestMapping("update.action")
	public String updateclassInfo(ClassInfo classInfo, Model model) {
		boolean result = classInfoService.updateClassInfo(classInfo);
		if (result) {
			model.addAttribute("info", "success");
		} else {
			model.addAttribute("info", "fault");
		}
		return this.list(null, model);
	}

	@RequestMapping("delete.action")
	public String deleteclassInfo(ClassInfo classInfo, Model model) {

		classInfo.setClassState("0");

		boolean result = classInfoService.updateClassInfo(classInfo);
		if (result) {
			model.addAttribute("info", "success");
		} else {
			model.addAttribute("info", "fault");
		}
		return this.list(null, model);
	}
}
