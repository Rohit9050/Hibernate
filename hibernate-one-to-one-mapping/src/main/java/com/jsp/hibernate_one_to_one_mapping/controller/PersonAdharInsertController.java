package com.jsp.hibernate_one_to_one_mapping.controller;

import java.time.LocalDate;

import com.jsp.hibernate_one_to_one_mapping.dao.PersonAdharDao;
import com.jsp.hibernate_one_to_one_mapping.dto.Adhar;
import com.jsp.hibernate_one_to_one_mapping.dto.Person;

public class PersonAdharInsertController {
	public static void main(String[] args) {
		PersonAdharDao dao = new PersonAdharDao();
		
		Adhar adhar = new Adhar(543212345, LocalDate.parse("2002-09-11"), "Gurugram", "Mukesh");

//		Person person = new Person(101, "rohit", "rohit123@gmail.com", 90501067, adhar);
		Person person = new Person(101, "rohit", "rohit123@gmail.com", 90501067, null);
//		Adhar adhar = new Adhar(4301345623, LocalDate.parse("2001-09-10"), "Gurugram", "Mukesh Kumar" );
		
				
		dao.savePersonAdharDao(person, adhar);
	}

}
