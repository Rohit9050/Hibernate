package com.jsp.hibernate_many_to_many.controller;

import java.util.List;

import com.jsp.hibernate_many_to_many.dao.StudentSubjectDao;
import com.jsp.hibernate_many_to_many.dto.Subject;

public class GetAllSubjectController {
	
	public static void main(String[] args) {
		StudentSubjectDao dao = new StudentSubjectDao();
		
		List<Subject> subjects = dao.getAllSubjectDao();
		
		for (Subject subject : subjects) {
			System.out.println(subject);
		}
	}

}
