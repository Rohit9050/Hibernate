
package com.jsp.hibernate_one_to_one_mapping.dto;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {
	
	@Id
	private int id;
	private String name;
	private String email;
	private long phone;
//	@OneToOne(cascade = CascadeType.ALL)
	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name = "adharnumber")
	private Adhar adhar;
	
}
