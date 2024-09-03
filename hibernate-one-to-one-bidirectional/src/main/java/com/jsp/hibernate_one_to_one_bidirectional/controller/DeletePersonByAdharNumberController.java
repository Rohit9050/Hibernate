package com.jsp.hibernate_one_to_one_bidirectional.controller;

import com.jsp.hibernate_one_to_one_bidirectional.dao.PersonAdharDao;

public class DeletePersonByAdharNumberController {
	
	public static void main(String[] args) {
		PersonAdharDao dao = new PersonAdharDao();
		boolean b = dao.deletePersonByAdharNumber(546789);
		if(b==true) {
			System.out.println("Data deleted");
		}else {
			System.out.println("Data not deleted");
		}
	}
	   

}
