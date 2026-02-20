package org.rohit.springjpapart3.Entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

/// Ques1. Create a class Address for Author with instance variables streetNumber, location, State.
@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    /// Ques2. Create instance variable of Address class inside Author class and save it as embedded
    @Embedded
    private Address address;

    /// Ques3. Introduce a List of subjects for author
    @ElementCollection(fetch= FetchType.LAZY)
    @CollectionTable(
            name = "author_subjects",
            joinColumns = @JoinColumn(name = "author_id")
    )
    @Column(name = "subject", nullable = false)
    private List<String> subjects = new ArrayList<>();

    /// Ques6. Implement One to One mapping between Author and Book
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "book_id", unique = true)
    private Book book;

    /// Ques7. Implement One to Many Mapping between Author and Book
    /// (Unidirectional, BiDirectional and without additional table) and implement cascade save.
    /// NOTE: Implementation can be done using:
    /// 1) @OneToMany with @JoinColumn (Unidirectional)
    /// 2) @OneToMany(mappedBy = "author") with @ManyToOne in Book (BiDirectional).

   // @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    //private List<Book> books = new ArrayList<>();


    /// Ques8. Implement Many to Many Mapping between Author and Book.

    /*@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "author_book",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private List<Book> books = new ArrayList<>();*/



    public Author() {}

    public Author(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // -------------- Getters ----------------

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public Book getBook() {
        return book;
    }

    // -------------- Setters ----------------

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /// Ques4. Persist 3 subjects for each author
    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    // -------------- Domain Logic Methods ----------------

    /// Ques3 (helper). Add a single subject to Author
    public void addSubject(String subject) {
        if (subject == null || subject.trim().isEmpty()) {
            throw new IllegalArgumentException("Subject cannot be null or empty");
        }
        this.subjects.add(subject);
    }

    public void removeSubject(String subject) {
        this.subjects.remove(subject);
    }

    /// Ques6. Maintain both sides of One-to-One relationship
    public void assignBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        this.book = book;
        book.setAuthor(this);
    }


    // Ques7: Add a Book to Author (One-to-Many helper)
    /*public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        this.books.add(book);
        book.setAuthor(this);   // owning side (Book) must be updated
    }

    // Ques7: Remove a Book from Author (One-to-Many helper)
    public void removeBook(Book book) {
        this.books.remove(book);
        if (book != null) {
            book.setAuthor(null);
        }
    }*/


    /// Ques8.
  /*  public void addBook(Book book) {
        if (book == null) throw new IllegalArgumentException("Book cannot be null");
        books.add(book);
        book.getAuthors().add(this);   // keep both sides in sync
    }

    public void removeBook(Book book) {
        books.remove(book);
        book.getAuthors().remove(this);
    }
    */


/*
    Ques 9.Which method on the session object can be used to remove an object from the cache?

    Ans.  In Hibernate, the method used to remove a specific object from the session cache (first-level cache) is : Session.evict(Object)
    This method removes the given object from the Hibernate session cache without deleting it from the database. After eviction, the object becomes detached, and any further changes made to it will not be automatically saved to the database unless it is reattached to the session.
    In simple terms, evict() removes an object from the cache but does not remove it from the database.





    Ques 10. What does @transactional annotation do?

    Ans. The @Transactional annotation in Spring is used to manage database transactions automatically. When a method is annotated with @Transactional, Spring ensures that all the database operations performed inside that method are executed within a single transaction.
    The main purpose of @Transactional is to maintain data consistency and integrity. It helps in avoiding situations where some database operations succeed while others fail, which could leave the database in an inconsistent state.
    In simple words, @Transactional ensures that a group of database operations either complete fully or do not happen at all.
    ex. @Transactional
    public void placeOrder() {
        orderRepository.save(order);
        paymentRepository.charge(payment);
    }


*/


}
