package com.jsp.hibernate_one_to_one_bidirectional.dto;

import java.io.Serializable;
import java.time.LocalDate;

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
@NoArgsConstructor
@AllArgsConstructor

@Entity

public class Adhar implements Serializable {
	@Id
	private long adharNumber;
	private LocalDate dob;
	private String address;
	private String fatherName;
	
	@OneToOne(mappedBy = "adhar")
//	@JoinColumn(name = "personId") iski jarrorat nhi hai kyoki ye eliminate ho raha hai
//	Non owning side class ke ander aur person reference ke variable ke uper mapped by likhnege
	
//	The mappedBy attribute indicates that the Adhar entity does not own the relationship; it is managed by the Person entity's adhar field.
	private Person person;

	@Override
	public String toString() {
		return "Adhar [adharNumber=" + adharNumber + ", dob=" + dob + ", address=" + address + ", fatherName="
				+ fatherName + "]";
	}
	
	
	

}
