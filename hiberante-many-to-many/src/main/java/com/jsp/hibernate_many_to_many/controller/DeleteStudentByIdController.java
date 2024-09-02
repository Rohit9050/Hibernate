package com.jsp.hibernate_many_to_many.controller;

import com.jsp.hibernate_many_to_many.dao.StudentSubjectDao;

public class DeleteStudentByIdController {
	
	public static void main(String[] args) {
		StudentSubjectDao dao = new StudentSubjectDao();
		boolean b = dao.deleteStudentByIddao(202);
		if(b==true) {
			System.out.println("Data deleted successfully");
		}
		else {
			System.out.println("Data not deleted");
		}
	}

}
