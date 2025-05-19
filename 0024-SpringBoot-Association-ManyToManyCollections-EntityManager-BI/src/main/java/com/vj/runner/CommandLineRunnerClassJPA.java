package com.vj.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.vj.model.Appointments;
import com.vj.model.Doctor;
import com.vj.service.IDoctorAppointmentsService;

@Component
public class CommandLineRunnerClassJPA implements CommandLineRunner {

	@Autowired
	private IDoctorAppointmentsService service;

	@Override
	@Transactional
	public void run(String... args) throws Exception {

		System.out.println("Runner Started...!");

        // Creating appointments
        Appointments app1 = new Appointments();
        app1.setPatientName("Alice");
        app1.setDescrp("General Checkup");

        Appointments app2 = new Appointments();
        app2.setPatientName("Bob");
        app2.setDescrp("Dental Checkup");

        // Save appointments first
        service.registerAppointmentInfo(app1);
        service.registerAppointmentInfo(app2);

        // Creating doctors and assigning appointments
        Doctor doctor1 = new Doctor();
        doctor1.setName("Dr. John");
        doctor1.setAppointments(List.of(app1));

        Doctor doctor2 = new Doctor();
        doctor2.setName("Dr. Emily");
        doctor2.setAppointments(List.of(app2));

        // Save doctors using merge (handles both new and existing entities)
        service.registerDoctorInfo(doctor1);
        service.registerDoctorInfo(doctor2);
	}

}
