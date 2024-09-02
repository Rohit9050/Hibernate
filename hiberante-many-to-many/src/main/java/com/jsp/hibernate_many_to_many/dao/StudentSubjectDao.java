package com.jsp.hibernate_many_to_many.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate_many_to_many.dto.Student;
import com.jsp.hibernate_many_to_many.dto.Subject;

public class StudentSubjectDao {

	EntityManager em = Persistence.createEntityManagerFactory("rohit").createEntityManager();
	EntityTransaction et = em.getTransaction();

	public List<Student> saveStudentAndSubjectDao(List<Student> stuList) {

		try {
			et.begin();
			for (Student student : stuList) {
				em.persist(student);
			}
			et.commit();
			return stuList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@SuppressWarnings("unchecked")
	public List<Student> getAllStudentDao() {
		return em.createQuery("from Student").getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Subject> getAllSubjectDao() {
		return em.createQuery("from Subject").getResultList();
	}

	public Student getStudentById(int id) {
		return em.find(Student.class, id);
	}

	public Subject getSubjectById(int id) {
		return em.find(Subject.class, id);
	}

	public void getUpdateStudentEmailById(String email, int id) {
		
		Student student = em.find(Student.class, id);
		System.out.println(student);
		
		try {
			et.begin();
			student.setEmail(email);
			em.merge(student);
			et.commit();
			System.out.println("Data updated successfully");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Data not updated");
		}
		

	}
	
	public void getUpdatePriceByUsingAuthorName(String authorName, int price) {
		
		String selectQuery = "Select s from Subject s where s.authorName=?1";
		
		Query query = em.createQuery(selectQuery);
		
		query.setParameter(1, authorName);
		
		Subject subject = (Subject) query.getSingleResult();
		
		try {
			if(subject!=null) {
				et.begin();
				subject.setPrice(price);
				em.merge(subject);
				et.commit();
				System.out.println("Data updated successfully");
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Data not updated");
		}
		
	
		
	}
	
	
	//Delete Operation
	
	public boolean deleteStudentByIddao(int id) {
		Student student = em.find(Student.class, id);
		et.begin();
		
		try {
			if(student!=null) {
				 em.createQuery("DELETE FROM Student s WHERE s.id = :studentId")
	              .setParameter("studentId", id)
	              .executeUpdate();
				 et.commit();
				 
				 return true;

			}
			else {
				
				return false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
