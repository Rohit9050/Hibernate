
package com.jsp.hibernate_one_to_one_mapping.dao;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate_one_to_one_mapping.dto.Adhar;
import com.jsp.hibernate_one_to_one_mapping.dto.Person;

public class PersonAdharDao {

	EntityManager em = Persistence.createEntityManagerFactory("rohit").createEntityManager();
	EntityTransaction et = em.getTransaction();

	public Person savePersonAdharDao(Person person, Adhar adhar) {

		try {

			et.begin();
//			em.persist(adhar);
			person.setAdhar(adhar);
			em.persist(person);
			et.commit();
			return person;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public boolean deletePersonByIdDao(int personId) {
		try {

			Person person = em.find(Person.class, personId);
			et.begin();
			if (person != null) {
				em.remove(person);
			}
			et.commit();
			System.out.println("Data Deleted successfully");
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

//	aise delete nhi kr sakte 
//	public boolean deleteAdharByIdDao(long adharId) {
//		try {
//			Adhar adhar = em.find(Adhar.class, adharId);
//			
//            et.begin();
//            if (adhar != null) {
//                em.remove(adhar);
//            }
//            et.commit();
//            System.out.println("Data Deleted successfully");
//            return true;
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			return false;
//		}
//		
//	}

	public boolean deleteAdharByIdDao(int personId) {
		Person person = findPersonByIdDao(personId);
		if (person != null) {
			et.begin();
			Adhar adhar = person.getAdhar();
			person.setAdhar(null);
			em.merge(person);
			if (adhar != null) {
				em.remove(adhar);
				et.commit();
			} else {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	public Person findPersonByIdDao(int personId) {
		return em.find(Person.class, personId);
	}

	public boolean updateAdharDobByPersonPhoneDao(long phone, LocalDate dob) {

		try {
			String selectQuery = "SELECT p FROM Person p WHERE p.phone = ?1";
			Query q1 = em.createQuery(selectQuery);
			q1.setParameter(1, phone);
			Person p = (Person) q1.getSingleResult();
			if (p != null) {
				Adhar adhar = p.getAdhar();
				if (adhar != null) {
					et.begin();
					adhar.setDob(dob);
					et.commit();
					return true;
				} else {
					return false;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

}
