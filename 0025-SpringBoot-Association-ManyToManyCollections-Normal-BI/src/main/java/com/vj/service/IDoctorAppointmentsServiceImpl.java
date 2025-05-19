package com.vj.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vj.model.Appointments;
import com.vj.model.Doctor;
import com.vj.repo.IAppointmentRepo;
import com.vj.repo.IDoctorRepo;

@Service
@Transactional
public class IDoctorAppointmentsServiceImpl implements IDoctorAppointmentsService {
	
	@Autowired
	private IDoctorRepo doctorRepo;
	
	@Autowired
	private IAppointmentRepo appRepo;

	
	@Override
	public String registerDoctorInfo(Doctor doctor) {
		return doctorRepo.save(doctor).getId()+" : Saved";
	}
	@Override
	public String registerAppointmentInfo(Appointments app) {
		return appRepo.save(app).getId()+" : Saved";
	}
	
}
