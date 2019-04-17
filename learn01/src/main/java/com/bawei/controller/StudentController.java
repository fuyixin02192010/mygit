package com.bawei.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bawei.entity.Student;
import com.bawei.service.StudentService;
import com.bawei.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;
	//展示
	@RequestMapping("list")
	public String getStuList(@RequestParam(defaultValue="")String sname,@RequestParam(defaultValue="1")Integer cpage,HttpServletRequest request){
		PageHelper.startPage(cpage, 3);
		List list=service.getStuList(sname);
		PageInfo info=new PageInfo(list);
		PageUtils page=new PageUtils(cpage, (int)info.getTotal(), 3, "list?sname="+sname, request);
		request.setAttribute("list", list);
		request.setAttribute("sname", sname);
		return "list";
	}
	//添加
	@RequestMapping("addStu")
	@ResponseBody
	public boolean addStu(Student stu){
		try {
			service.addStu(stu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	//修改
	@RequestMapping("update")
	@ResponseBody
	public boolean update(Student stu){
		try {
			System.out.println("-------------------------------"+stu.getSid());
			service.update(stu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	//通过Id回显
	@RequestMapping("getStuById")
	@ResponseBody
	public Object getStuById(int sid){
		Student stu=service.getStuById(sid);
		Map map=new HashMap();
		map.put("stu", stu);
		return map;
	}
}
