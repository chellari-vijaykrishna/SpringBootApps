package com.vj.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.vj.model.Appointments;
import com.vj.model.Doctor;
import com.vj.service.IDoctorAppointmentsService;

import jakarta.persistence.EntityManager;


@Component
@Transactional
public class CommandLineRunnerClassEntityManager implements CommandLineRunner {

	@Autowired
	private EntityManager entityManager;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Runner Started...!");

		Appointments ap1 = new Appointments();
		ap1.setId(1);
		ap1.setPatientName("A");
		ap1.setDescrp("Fever");

		Appointments ap2 = new Appointments();
		ap2.setId(2);
		ap2.setPatientName("B");
		ap2.setDescrp("Back Pain");

		Appointments ap3 = new Appointments();
		ap3.setId(3);
		ap3.setPatientName("C");
		ap3.setDescrp("Headache");

		Doctor doctor = new Doctor();
		doctor.setId(1);
		doctor.setName("Vijay");
		
		Doctor doctor1 = new Doctor();
		doctor1.setId(2);
		doctor1.setName("Krishna");

		Doctor doctor2 = new Doctor();
		doctor2.setId(3);
		doctor2.setName("Ram");
		
		doctor.setAppointments(List.of(ap1,ap2));
		doctor.setAppointments(List.of(ap3));
		
		ap1.setDoctor(List.of(doctor1, doctor2));
		ap2.setDoctor(List.of(doctor));
		
        entityManager.persist(doctor);
        entityManager.persist(doctor1);
        entityManager.persist(doctor2);
        
        entityManager.persist(ap1);
        entityManager.persist(ap2);
        entityManager.persist(ap3);
	}

}
