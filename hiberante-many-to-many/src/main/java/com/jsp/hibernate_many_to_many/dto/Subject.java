package com.jsp.hibernate_many_to_many.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Subject { 
	@Id
	private int id;
	private String name;
	private String authorName;
	private LocalDate publishYear;
	private double price;
	

}