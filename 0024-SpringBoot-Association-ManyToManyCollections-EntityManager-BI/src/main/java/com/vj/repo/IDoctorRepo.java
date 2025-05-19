package com.vj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vj.model.Doctor;

@Repository
public interface IDoctorRepo extends JpaRepository<Doctor, Integer> {

}
