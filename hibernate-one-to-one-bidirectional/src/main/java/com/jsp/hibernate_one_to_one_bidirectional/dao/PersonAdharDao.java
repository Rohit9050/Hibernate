package com.jsp.hibernate_one_to_one_bidirectional.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_one_to_one_bidirectional.dto.Adhar;
import com.jsp.hibernate_one_to_one_bidirectional.dto.Person;

public class PersonAdharDao {

	EntityManager em = Persistence.createEntityManagerFactory("rohit").createEntityManager();
	EntityTransaction et = em.getTransaction();

	public Person savePersonAdharDao(Person person, Adhar adhar) {

		try {

			et.begin();
			person.setAdhar(adhar);
			adhar.setPerson(person);
			em.persist(person);
			et.commit();
			return person;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public Person getPersonAdharPersonIdByDao(int personId) {
		return em.find(Person.class, personId);
	}

//	public boolean deletePersonByAdharId(int adharId) {
//		Adhar adhar = em.find(Adhar.class, adharId);
//
//		try {
//			et.begin();
//			em.remove(adhar);
//			et.commit();
//			return true;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return false;
//		}
//
//	}

	public Adhar getAdharPersonByAdharNumberDao(long adharnumber) {
		return em.find(Adhar.class, adharnumber);
	}

	public boolean deletePersonByAdharNumber(long adharNumber) {
		Adhar adhar = em.find(Adhar.class, adharNumber);

		try {
			if (adhar != null) {
				et.begin();
				Person person = adhar.getPerson();
				if(person!=null) {
					
					em.remove(person);
				}
				et.commit();
				return true;
			}else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
