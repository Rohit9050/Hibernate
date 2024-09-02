package com.jsp.hibernate_many_to_many.controller;

import com.jsp.hibernate_many_to_many.dao.StudentSubjectDao;

public class UpdatePriceByUsingAuthorName {
	
	public static void main(String[] args) {
		StudentSubjectDao dao = new StudentSubjectDao();
		dao.getUpdatePriceByUsingAuthorName("Tim", 500);
	}

}
