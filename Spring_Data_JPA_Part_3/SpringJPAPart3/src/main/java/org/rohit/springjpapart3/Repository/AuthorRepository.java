package org.rohit.springjpapart3.Repository;
import org.rohit.springjpapart3.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}

