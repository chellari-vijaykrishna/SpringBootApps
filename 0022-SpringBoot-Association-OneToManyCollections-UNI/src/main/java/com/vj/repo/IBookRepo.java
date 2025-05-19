package com.vj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vj.model.Book;

@Repository
public interface IBookRepo extends JpaRepository<Book, Integer> {

}
