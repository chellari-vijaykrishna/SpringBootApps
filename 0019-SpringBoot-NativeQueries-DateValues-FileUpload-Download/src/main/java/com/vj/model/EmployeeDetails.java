package com.vj.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDetails implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "gen1",strategy = GenerationType.AUTO)
	private Integer empId;
	//Photo as Photo (photo.jpg)
	@Lob
	private byte[] empPhoto;
	//Resume as Text doc (Resume.txt)
	@Lob
	private char[] empResume;
	
	public EmployeeDetails(byte[] empPhoto, char[] empResume) {
		this.empPhoto = empPhoto;
		this.empResume = empResume;
	}
	
	

}
