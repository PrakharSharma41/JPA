package com.example.webpage.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webpage.WebpageApplication;
import com.example.webpage.dao.BookRepositoryDao;
import com.example.webpage.models.Book;

@Service
public class BookService {

    @Autowired
    private BookRepositoryDao bookDao;    
    public Optional<Book> findAllBooks(long id) {
        Optional<Book>ls=bookDao.findById(id);
        return ls;
    }
    public List<Book> findAllBooksByIdAndName(long id,String name) {
        List<Book>ls=bookDao.findByIdAndName(id,name);
        return ls;
    }
    public List<Book> findAllBooksByStudentName() {
        List<Book>ls=bookDao.findByStudentName();
        return ls;
    }


    public int saveBook(Book book) {        
        bookDao.save(book);
        bookDao.findAll();
        return 0;
    }
}
