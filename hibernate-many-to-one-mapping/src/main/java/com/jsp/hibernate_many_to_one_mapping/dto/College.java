package com.jsp.hibernate_many_to_one_mapping.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class College {
	@Id
	private int id;
	private String name;
	private String address;
	private String type;
    @ManyToOne(cascade = CascadeType.ALL)
	private University university;
}




//
//The flow of data in your Hibernate many-to-one mapping scenario involves saving multiple College entities that are associated with a single University entity. Here’s a detailed breakdown of how the data flows and is saved:
//
//Entity Definitions:
//
//College is defined with a many-to-one relationship to University. This means each College can be associated with one University.
//University is defined separately and has a unique identifier (id), name, and address.
//Controller and DAO Setup:
//
//InsertCollegeUniversityController creates instances of College and University.
//These instances are then passed to a DAO method (saveCollegeUniversityDao) to be persisted in the database.
//Persistence Logic:
//
//When you call dao.saveCollegeUniversityDao(colleges), the method is responsible for saving the entities to the database.
//Since CascadeType.ALL is used on the university field in the College class, it ensures that when a College entity is saved, the associated University entity is also saved automatically if it's not already present in the database.