package com.vj.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	private String studentName;

	@ManyToMany(targetEntity = Courses.class,cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
	@JoinTable(
			name = "student_coursers_fk",
			joinColumns = @JoinColumn(name = "student_id_fk"),
			inverseJoinColumns = @JoinColumn(name="coursers_id_fk")
	)
	private Set<Courses> courses;

}
