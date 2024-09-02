package com.jsp.hibernate_many_to_many.controller;

import java.util.Scanner;

import com.jsp.hibernate_many_to_many.dao.StudentSubjectDao;
import com.jsp.hibernate_many_to_many.dto.Subject;

public class GetSubjectById {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the subject id");
		int id = sc.nextInt();
		StudentSubjectDao dao = new StudentSubjectDao();
		
		Subject subject = dao.getSubjectById(id);
		if(subject!=null) {
			System.out.println(subject);
		}
		else {
			System.out.println("Subject Id not fount or Subject Not FOund");
		}
	}

}
