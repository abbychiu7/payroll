package com.ict.payroll.domain;

import static com.ict.payroll.domain.EmployeeTestSamples.*;
import static com.ict.payroll.domain.PaymentTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.ict.payroll.web.rest.TestUtil;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Employee.class);
        Employee employee1 = getEmployeeSample1();
        Employee employee2 = new Employee();
        assertThat(employee1).isNotEqualTo(employee2);

        employee2.setId(employee1.getId());
        assertThat(employee1).isEqualTo(employee2);

        employee2 = getEmployeeSample2();
        assertThat(employee1).isNotEqualTo(employee2);
    }

    @Test
    void paymentTest() throws Exception {
        Employee employee = getEmployeeRandomSampleGenerator();
        Payment paymentBack = getPaymentRandomSampleGenerator();

        employee.addPayment(paymentBack);
        assertThat(employee.getPayments()).containsOnly(paymentBack);
        assertThat(paymentBack.getEmployee()).isEqualTo(employee);

        employee.removePayment(paymentBack);
        assertThat(employee.getPayments()).doesNotContain(paymentBack);
        assertThat(paymentBack.getEmployee()).isNull();

        employee.payments(new HashSet<>(Set.of(paymentBack)));
        assertThat(employee.getPayments()).containsOnly(paymentBack);
        assertThat(paymentBack.getEmployee()).isEqualTo(employee);

        employee.setPayments(new HashSet<>());
        assertThat(employee.getPayments()).doesNotContain(paymentBack);
        assertThat(paymentBack.getEmployee()).isNull();
    }
}
