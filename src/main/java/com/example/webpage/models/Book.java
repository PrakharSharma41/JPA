package com.example.webpage.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Book {

    @Id
    @SequenceGenerator(name = "book_sequence", allocationSize = 2)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_sequence")
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name", nullable = false,columnDefinition = "TEXT")
    private String name;

    @Column(name = "price", nullable  = false,columnDefinition = "float",unique = true)
    private BigDecimal price;

    public Book() {
        System.out.println("in default ");
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }    
}
