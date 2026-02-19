package org.rohit.springjpapart2.Repository.Component;
import org.rohit.springjpapart2.Entity.Component.EmployeeComponent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/// Ques4. Component Mapping:
///
/// Q1) Implement and demonstrate Embedded mapping using employee table having following fields: id, firstName, lastName, age, basicSalary, bonusSalary, taxAmount, specialAllowanceSalary

@Repository
public interface EmployeeComponentRepository extends JpaRepository<EmployeeComponent, Long> {
}

