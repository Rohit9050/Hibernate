
package com.jsp.hibernate_one_to_one_bidirectional.dto;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person implements Serializable {
	
	@Id
	private int id;
	private String name;
	private String email;
	private long phone;
//	@OneToOne(cascade = CascadeType.ALL)
	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name = "adharnumber")
	private Adhar adhar;
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
	
}
