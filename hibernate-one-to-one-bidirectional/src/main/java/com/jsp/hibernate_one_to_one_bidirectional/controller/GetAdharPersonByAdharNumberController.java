package com.jsp.hibernate_one_to_one_bidirectional.controller;

import com.jsp.hibernate_one_to_one_bidirectional.dao.PersonAdharDao;
import com.jsp.hibernate_one_to_one_bidirectional.dto.Adhar;

public class GetAdharPersonByAdharNumberController {
	
	public static void main(String[] args) {
		PersonAdharDao dao = new PersonAdharDao();
		
		Adhar adhar = dao.getAdharPersonByAdharNumberDao(546789);
		System.out.println(adhar);
		System.out.println(adhar.getPerson());
	}

}
