package org.rohit.springjpapart1.Repository;

import org.rohit.springjpapart1.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Ques 2. Set up EmployeeRepository with Spring Data JPA

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Ques 9. Create and use finder to find Employee by Name
    List<Employee> findByName(String name);


    // Ques 10. Create and use finder to find Employees starting with A character
    List<Employee> findByNameStartingWith(String prefix);


    //Ques 11. Create and use finder to find Employees Between the age of 28 to 32
    List<Employee> findByAgeBetween(Integer startAge, Integer endAge);

}
