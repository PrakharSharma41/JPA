package com.example.webpage.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.webpage.models.Book;

public interface BookRepositoryDao extends JpaRepository<Book,Long>{

    @Query(value = "SELECT * FROM books WHERE id = :id and name = :name", nativeQuery = true)
    List<Book> findByIdAndName(@Param("id") long id,@Param("name") String name);

    @Query(value = "select books.id,books.name,books.price from books inner join students on books.name = students.name",nativeQuery = true)
    List<Book>findByStudentName();
}
