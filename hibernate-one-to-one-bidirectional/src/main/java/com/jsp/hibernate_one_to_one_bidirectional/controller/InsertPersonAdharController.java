package com.jsp.hibernate_one_to_one_bidirectional.controller;

import java.time.LocalDate;

import com.jsp.hibernate_one_to_one_bidirectional.dao.PersonAdharDao;
import com.jsp.hibernate_one_to_one_bidirectional.dto.Adhar;
import com.jsp.hibernate_one_to_one_bidirectional.dto.Person;

public class InsertPersonAdharController {
	
	public static void main(String[] args) {
		PersonAdharDao dao = new PersonAdharDao();
		Adhar adhar = new Adhar(546789, LocalDate.parse("2001-05-04"), "Khor", "Mukesh Kumar",null);
		Person person = new Person(101, "rohit", "rohit123@gmail.com", 90501067, null);
		
		dao.savePersonAdharDao(person, adhar);
	}

}
