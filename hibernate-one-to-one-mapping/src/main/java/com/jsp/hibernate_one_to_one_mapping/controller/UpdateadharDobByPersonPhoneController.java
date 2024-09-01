package com.jsp.hibernate_one_to_one_mapping.controller;

import java.time.LocalDate;

import com.jsp.hibernate_one_to_one_mapping.dao.PersonAdharDao;

public class UpdateadharDobByPersonPhoneController {
	
	public static void main(String[] args) {
		PersonAdharDao dao = new PersonAdharDao();
		boolean b = dao.updateAdharDobByPersonPhoneDao(90501067, LocalDate.parse("2015-05-10") );
		System.out.println(b);
	}
}
