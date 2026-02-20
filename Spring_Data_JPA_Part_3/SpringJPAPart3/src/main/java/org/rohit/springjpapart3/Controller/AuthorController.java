package org.rohit.springjpapart3.Controller;
import org.rohit.springjpapart3.Entity.Author;
import org.rohit.springjpapart3.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/authors")
public class AuthorController {

  @Autowired
  private AuthorRepository authorRepository;

    @PostMapping
    public Author create(@RequestBody Author author) {
        if (author.getBook() != null) {
            author.assignBook(author.getBook());  // CRITICAL
        }
        return authorRepository.save(author);
    }

    @GetMapping
    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Author> getById(@PathVariable Long id) {
        return authorRepository.findById(id);
    }


}

