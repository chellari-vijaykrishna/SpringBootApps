package com.vj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vj.model.PersonInformation;

@Repository
public interface IPersonInfoRepo extends JpaRepository<PersonInformation, Integer> {

}
