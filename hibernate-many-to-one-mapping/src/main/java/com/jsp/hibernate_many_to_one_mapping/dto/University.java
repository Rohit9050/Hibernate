package com.jsp.hibernate_many_to_one_mapping.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class University {
	@Id
	private int id;
	private String name;
	private String address;

}
