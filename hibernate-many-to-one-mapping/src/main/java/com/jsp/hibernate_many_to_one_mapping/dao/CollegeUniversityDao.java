package com.jsp.hibernate_many_to_one_mapping.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_many_to_one_mapping.dto.College;

public class CollegeUniversityDao {
	

		EntityManager em = Persistence.createEntityManagerFactory("rohit").createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		public List<College> saveCollegeUniversityDao(List<College> colleges) {
			try {
				
				et.begin();
			
				for (College college : colleges) {
					em.persist(college);
				}
				et.commit();
				return colleges;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
	


}
