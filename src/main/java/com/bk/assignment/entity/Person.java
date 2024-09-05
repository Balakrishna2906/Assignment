package com.bk.assignment.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="person")
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int personId;
	
	
	@Column(nullable = false)
	private String name;
	
	
	@Column(nullable = false)
	private int age;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="addressId" ,referencedColumnName = "addressId")
	private PersonAddress address;
	
	
	

}
