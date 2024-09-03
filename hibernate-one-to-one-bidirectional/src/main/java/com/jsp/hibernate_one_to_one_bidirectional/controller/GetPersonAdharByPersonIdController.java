package com.jsp.hibernate_one_to_one_bidirectional.controller;

import com.jsp.hibernate_one_to_one_bidirectional.dao.PersonAdharDao;
import com.jsp.hibernate_one_to_one_bidirectional.dto.Person;

public class GetPersonAdharByPersonIdController {
	
	public static void main(String[] args) {
		PersonAdharDao dao = new PersonAdharDao();
		
		Person person = dao.getPersonAdharPersonIdByDao(101);
		
		System.out.println(person);
		System.out.println(person.getAdhar());
	}

}
