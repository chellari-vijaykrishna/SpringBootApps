package com.vj.service;


import com.vj.model.Appointments;
import com.vj.model.Doctor;

public interface IDoctorAppointmentsService {

	public String registerDoctorInfo(Doctor doctor);
	public String registerAppointmentInfo(Appointments app);
	
}
