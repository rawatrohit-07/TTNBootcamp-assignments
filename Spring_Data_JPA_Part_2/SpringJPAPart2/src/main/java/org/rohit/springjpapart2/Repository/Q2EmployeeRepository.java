package org.rohit.springjpapart2.Repository;

import jakarta.transaction.Transactional;
import org.rohit.springjpapart2.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;


//// Native Query:
///
/// Instructions:
/// A) Create an employeeTable table with the following fields: empId, empFirstName, empLastName, empSalary, empAge.
///
/// B) Create an Employee entity having following fields: id, firstName, lastName, salary, age which maps to the table columns given in above.

@Repository
public interface Q2EmployeeRepository extends JpaRepository<Employee, Long> {
    // Q1:  Display the id, first name, age of all employees where last name ends with "singh"
    @Query(
            value = """
                SELECT emp_id, emp_first_name, emp_age
                FROM employee_table
                WHERE LOWER(emp_last_name) LIKE CONCAT('%', LOWER(:suffix))
                """,
            nativeQuery = true
    )
    List<Object[]> findEmployeesByLastNameEndingWith(@Param("suffix") String suffix);

    // Q2: Delete all employees with age greater than 45(Should be passed as a parameter)
    @Modifying
    @Transactional
    @Query(
            value = """
                DELETE FROM employee_table
                WHERE emp_age > :age
                """,
            nativeQuery = true
    )
    int deleteEmployeesWithAgeGreaterThan(@Param("age") Integer age);
}
