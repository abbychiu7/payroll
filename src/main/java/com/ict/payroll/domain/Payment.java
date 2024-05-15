package com.ict.payroll.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Payment.
 */
@Entity
@Table(name = "payment")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "pay_month")
    private Integer payMonth;

    @Column(name = "pay_year")
    private Integer payYear;

    @Column(name = "monthly_salary")
    private Double monthlySalary;

    @Column(name = "deductions")
    private Double deductions;

    @Column(name = "net_pay")
    private Double netPay;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Payment id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPayMonth() {
        return this.payMonth;
    }

    public Payment payMonth(Integer payMonth) {
        this.setPayMonth(payMonth);
        return this;
    }

    public void setPayMonth(Integer payMonth) {
        this.payMonth = payMonth;
    }

    public Integer getPayYear() {
        return this.payYear;
    }

    public Payment payYear(Integer payYear) {
        this.setPayYear(payYear);
        return this;
    }

    public void setPayYear(Integer payYear) {
        this.payYear = payYear;
    }

    public Double getMonthlySalary() {
        return this.monthlySalary;
    }

    public Payment monthlySalary(Double monthlySalary) {
        this.setMonthlySalary(monthlySalary);
        return this;
    }

    public void setMonthlySalary(Double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public Double getDeductions() {
        return this.deductions;
    }

    public Payment deductions(Double deductions) {
        this.setDeductions(deductions);
        return this;
    }

    public void setDeductions(Double deductions) {
        this.deductions = deductions;
    }

    public Double getNetPay() {
        return this.netPay;
    }

    public Payment netPay(Double netPay) {
        this.setNetPay(netPay);
        return this;
    }

    public void setNetPay(Double netPay) {
        this.netPay = netPay;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Payment)) {
            return false;
        }
        return getId() != null && getId().equals(((Payment) o).getId());
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Payment{" +
            "id=" + getId() +
            ", payMonth=" + getPayMonth() +
            ", payYear=" + getPayYear() +
            ", monthlySalary=" + getMonthlySalary() +
            ", deductions=" + getDeductions() +
            ", netPay=" + getNetPay() +
            "}";
    }
}
