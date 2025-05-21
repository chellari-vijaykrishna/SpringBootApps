package com.vj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vj.model.Passport;

public interface IPassportRepo extends JpaRepository<Passport, Integer> {

}
