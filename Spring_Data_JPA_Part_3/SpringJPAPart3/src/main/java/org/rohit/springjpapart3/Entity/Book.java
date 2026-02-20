package org.rohit.springjpapart3.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookName;

    /// Ques6. Inverse side of One-to-One mapping with Author
    @OneToOne(mappedBy = "book", fetch = FetchType.LAZY)
    private Author author;


    /// Ques7. Implement One to Many Mapping between Author and Book
    /// @ManyToOne(fetch = FetchType.LAZY)
    /// @JoinColumn(name = "author_id")
    /// private Author author;



    /// Ques8 (Many-to-Many) - NOTE:
    /// For Many-to-Many mapping, this class would contain:
    /// @ManyToMany(mappedBy = "books")
    /// private List<Author> authors;


    // -------------- Constructors ----------------

    public Book() {}

    public Book(String bookName) {
        this.bookName = bookName;
    }

    // -------------- Getters ----------------

    public Long getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    // -------------- Setters ----------------

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /// Ques6. Setter to maintain bidirectional One-to-One relationship
    public void setAuthor(Author author) {
        this.author = author;
    }


    // Ques7: Setter required to maintain One-to-Many relationship (sets FK)
   /* public void setAuthor(Author author) {
        this.author = author;
    }*/

    ///Ques8.
    /*public List<Author> getAuthors() {
        return authors;
    }*/
}
