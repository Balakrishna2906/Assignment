package com.bk.assignment.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="Person_address")
@AllArgsConstructor
@NoArgsConstructor
public class PersonAddress implements Serializable {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
	
	@Column(nullable = false)
	private String street;
	
	@Column(nullable = false)
	private String state;
	
@OneToOne(mappedBy ="address" )
@JsonBackReference
	private Person person;
	
	
}
