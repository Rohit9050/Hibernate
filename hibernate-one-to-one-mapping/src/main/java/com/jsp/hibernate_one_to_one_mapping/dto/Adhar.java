package com.jsp.hibernate_one_to_one_mapping.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Adhar {
	@Id
	private long adharNumber;
	private LocalDate dob;
	private String address;
	private String fatherName;
	

}
