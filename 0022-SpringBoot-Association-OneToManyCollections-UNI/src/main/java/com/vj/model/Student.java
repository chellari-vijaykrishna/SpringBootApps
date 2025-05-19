package com.vj.model;


import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	private Integer StudentId;
	private String StudentName;
	
	@OneToMany(targetEntity = Book.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "fkey")
	private Set<Book> studentBook;
}
