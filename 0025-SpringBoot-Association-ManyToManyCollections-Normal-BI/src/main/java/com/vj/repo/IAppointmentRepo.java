package com.vj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vj.model.Appointments;

@Repository
public interface IAppointmentRepo extends JpaRepository<Appointments, Integer> {

}
