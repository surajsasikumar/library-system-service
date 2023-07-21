package com.target.ready.library.system.service.LibrarySystemService.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name="Book",uniqueConstraints = @UniqueConstraint(columnNames = { "book_name", "author_name" }))
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    @Column(name="book_name")
    private String bookName;
    private String bookDescription;
    private String categoryName;
    @Column(name="author_name")
    private String authorName;
    private int publicationYear;

}
