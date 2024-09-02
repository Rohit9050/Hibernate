package com.jsp.hibernate_many_to_many.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

	@Id
	private int id;
	private String name;
	private String email;
	private long phone;

	@JoinTable(name = "StudentSubject", joinColumns = { @JoinColumn(name = "studentId"), },

			inverseJoinColumns = { @JoinColumn(name = "subjectId") })
	@ManyToMany(cascade = CascadeType.ALL)
	List<Subject> subList;

}
