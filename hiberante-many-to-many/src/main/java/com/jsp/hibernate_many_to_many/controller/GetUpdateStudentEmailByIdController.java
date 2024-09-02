package com.jsp.hibernate_many_to_many.controller;

import com.jsp.hibernate_many_to_many.dao.StudentSubjectDao;

public class GetUpdateStudentEmailByIdController {
	
	public static void main(String[] args) {
		StudentSubjectDao dao = new StudentSubjectDao();
		dao.getUpdateStudentEmailById("rahul123@gmail.com", 201);
	}

}
