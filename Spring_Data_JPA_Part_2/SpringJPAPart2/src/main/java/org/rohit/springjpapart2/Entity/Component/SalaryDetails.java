package org.rohit.springjpapart2.Entity.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/// Ques4. Component Mapping:
///
/// 1) Implement and demonstrate Embedded mapping using employee table having following fields: id, firstName, lastName, age, basicSalary, bonusSalary, taxAmount, specialAllowanceSalary


@Embeddable
public class SalaryDetails {

    @Column(name = "basic_salary")
    private Double basicSalary;

    @Column(name = "bonus_salary")
    private Double bonusSalary;

    @Column(name = "tax_amount")
    private Double taxAmount;

    @Column(name = "special_allowance_salary")
    private Double specialAllowanceSalary;

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(Double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Double getSpecialAllowanceSalary() {
        return specialAllowanceSalary;
    }

    public void setSpecialAllowanceSalary(Double specialAllowanceSalary) {
        this.specialAllowanceSalary = specialAllowanceSalary;
    }
}
