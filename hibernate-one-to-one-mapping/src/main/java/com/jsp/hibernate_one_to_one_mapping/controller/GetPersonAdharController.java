package com.jsp.hibernate_one_to_one_mapping.controller;

import com.jsp.hibernate_one_to_one_mapping.dao.PersonAdharDao;
import com.jsp.hibernate_one_to_one_mapping.dto.Person;

public class GetPersonAdharController {
	
	public static void main(String[] args) {
		PersonAdharDao dao = new PersonAdharDao();
		Person person = dao.findPersonByIdDao(101);
		System.out.println(person);
		
//		System.out.println(person.getAdhar());
	}

}

