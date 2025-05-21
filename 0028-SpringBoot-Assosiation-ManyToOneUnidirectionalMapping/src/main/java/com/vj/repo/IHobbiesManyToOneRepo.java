package com.vj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vj.model.HobbiesManyToOne;

public interface IHobbiesManyToOneRepo extends JpaRepository<HobbiesManyToOne, Integer> {

}
