package com.bk.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bk.assignment.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
