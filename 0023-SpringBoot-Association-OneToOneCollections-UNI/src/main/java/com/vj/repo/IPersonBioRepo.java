package com.vj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vj.model.PersonBio;

@Repository
public interface IPersonBioRepo extends JpaRepository<PersonBio, Integer> {

}
