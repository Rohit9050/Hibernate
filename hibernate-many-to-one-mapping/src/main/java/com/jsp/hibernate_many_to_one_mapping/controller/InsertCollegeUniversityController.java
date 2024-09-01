package com.jsp.hibernate_many_to_one_mapping.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.jsp.hibernate_many_to_one_mapping.dao.CollegeUniversityDao;
import com.jsp.hibernate_many_to_one_mapping.dto.College;
import com.jsp.hibernate_many_to_one_mapping.dto.University;

public class InsertCollegeUniversityController {

	public static void main(String[] args) {

		CollegeUniversityDao dao = new CollegeUniversityDao();
		University university = new University(501, "IGU", "Rewari");
		College college1 = new College(101, "IGC", "Meerpur Rewari", "Engineering", university);
		College college2 = new College(102, "XYZ", "Rewari", "Medical", university);
		List<College> colleges = new ArrayList<College>(Arrays.asList(college1, college2));

		dao.saveCollegeUniversityDao(colleges);
	}

}
