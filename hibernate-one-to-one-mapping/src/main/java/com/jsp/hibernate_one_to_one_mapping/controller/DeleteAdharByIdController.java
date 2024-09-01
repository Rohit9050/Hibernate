package com.jsp.hibernate_one_to_one_mapping.controller;

import com.jsp.hibernate_one_to_one_mapping.dao.PersonAdharDao;

public class DeleteAdharByIdController {
	
	public static void main(String[] args) {
		PersonAdharDao dao = new PersonAdharDao();
		
		boolean b = dao.deleteAdharByIdDao(101);
		System.out.println(b);
	}

}
