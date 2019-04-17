package com.bawei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.StudentDao;
import com.bawei.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao dao;

	//展示
	public List getStuList(String sname) {
		// TODO Auto-generated method stub
		return dao.getStuList(sname);
	}

	//添加
	public void addStu(Student stu) {
		dao.addStu(stu);
	}

	//通过Id回显
	public Student getStuById(int sid) {
		// TODO Auto-generated method stub
		return dao.getStuById(sid);
	}

	//修改
	public void update(Student stu) {
		dao.update(stu);
	}
	
}
