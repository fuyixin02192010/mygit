package com.bawei.service;

import java.util.List;

import com.bawei.entity.Student;

public interface StudentService {
	//展示
	List getStuList(String sname);
	//添加
	void addStu(Student stu);
	//通过Id回显
	Student getStuById(int sid);
	//修改
	void update(Student stu);
	
}
