package com.jsp.hibernate_many_to_many.controller;

import java.util.List;

import com.jsp.hibernate_many_to_many.dao.StudentSubjectDao;
import com.jsp.hibernate_many_to_many.dto.Student;

public class GetAllStudentController {
	public static void main(String[] args) {
		StudentSubjectDao dao = new StudentSubjectDao();
		
		List<Student> students = dao.getAllStudentDao();
		
		for(Student student : students) {
			System.out.println(student);
		}
	}


}
