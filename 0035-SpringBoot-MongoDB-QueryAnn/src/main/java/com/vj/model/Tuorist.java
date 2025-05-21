package com.vj.model;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tuorist {

	@Id
    private String id; // MongoDB auto-generated ID or custom
    private String touristName;
    private String nativePlace;
    private Float age;
    private String passportNo;
    private Long contactNo;
    private Boolean isVaccinated;
    private Integer visaDuration;
    private LocalDateTime visaExpiryTime;
	public Tuorist(String touristName, String nativePlace, Float age, String passportNo, Long contactNo,
			Boolean isVaccinated, Integer visaDuration, LocalDateTime visaExpiryTime) {
		this.touristName = touristName;
		this.nativePlace = nativePlace;
		this.age = age;
		this.passportNo = passportNo;
		this.contactNo = contactNo;
		this.isVaccinated = isVaccinated;
		this.visaDuration = visaDuration;
		this.visaExpiryTime = visaExpiryTime;
	}
    
    
}
