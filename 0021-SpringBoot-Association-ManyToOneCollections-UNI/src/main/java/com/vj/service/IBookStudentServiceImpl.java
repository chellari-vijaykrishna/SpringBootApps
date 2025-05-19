package com.vj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vj.model.Book;
import com.vj.model.Student;
import com.vj.repo.IBookRepo;
import com.vj.repo.IStudentRepo;

@Service
public class IBookStudentServiceImpl implements IBookStudentService {
	
	@Autowired
	private IBookRepo bookRepo;
	
	@Autowired
	private IStudentRepo studentRepo;

	@Override
	public String registerBookInfo(Book book) {
		return bookRepo.save(book).getBookId()+" : Saved";
	}

	@Override
	public String registerStudentInfo(Student student) {
		return studentRepo.save(student).getStudentId()+" : Saved";
	}

	
	
}
