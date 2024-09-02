package com.jsp.hibernate_many_to_many.controller;

import java.util.Scanner;

import com.jsp.hibernate_many_to_many.dao.StudentSubjectDao;
import com.jsp.hibernate_many_to_many.dto.Student;

public class GetStudentById {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the student id");
		int id = sc.nextInt();
		StudentSubjectDao dao = new StudentSubjectDao();
		
		Student student = dao.getStudentById(id);
		if(student!=null) {
			System.out.println(student);
		}
		else {
			System.out.println("Student Id not fount or Student Not FOund");
		}
	}

}
