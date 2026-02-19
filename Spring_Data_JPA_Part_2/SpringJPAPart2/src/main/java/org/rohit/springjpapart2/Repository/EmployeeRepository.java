package org.rohit.springjpapart2.Repository;

import jakarta.transaction.Transactional;
import org.rohit.springjpapart2.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Q1) Display the first name, last name of all employees having salary greater than average salary ordered in ascending by their age and in descending by their salary.
    @Query("""
           SELECT e.firstName, e.lastName 
           FROM Employee e 
           WHERE e.salary > (SELECT AVG(emp.salary) FROM Employee emp)
           ORDER BY e.age ASC, e.salary DESC
           """)
    List<Object[]> findEmployeesWithSalaryGreaterThanAvg();

    // Q2) Update salary of all employees by a salary passed as a parameter whose existing salary is less than the average salary.
    @Modifying
    @Transactional
    @Query("""
           UPDATE Employee e 
           SET e.salary = :newSalary 
           WHERE e.salary < (SELECT AVG(emp.salary) FROM Employee emp)
           """)
    int updateSalaryLessThanAvg(@Param("newSalary") Double newSalary);

    // Q3) Delete employees with minimum salary
    @Modifying
    @Transactional
    @Query("""
           DELETE FROM Employee e 
           WHERE e.salary = (SELECT MIN(emp.salary) FROM Employee emp)
           """)
    int deleteEmployeesWithMinSalary();
}
