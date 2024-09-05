package com.bk.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bk.assignment.entity.PersonAddress;

public interface PersonAddressRepository extends JpaRepository<PersonAddress, Integer> {

}
