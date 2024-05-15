package com.ict.payroll.domain;

import static com.ict.payroll.domain.EmployeeTestSamples.*;
import static com.ict.payroll.domain.PaymentTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.ict.payroll.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class PaymentTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Payment.class);
        Payment payment1 = getPaymentSample1();
        Payment payment2 = new Payment();
        assertThat(payment1).isNotEqualTo(payment2);

        payment2.setId(payment1.getId());
        assertThat(payment1).isEqualTo(payment2);

        payment2 = getPaymentSample2();
        assertThat(payment1).isNotEqualTo(payment2);
    }

    @Test
    void employeeTest() throws Exception {
        Payment payment = getPaymentRandomSampleGenerator();
        Employee employeeBack = getEmployeeRandomSampleGenerator();

        payment.setEmployee(employeeBack);
        assertThat(payment.getEmployee()).isEqualTo(employeeBack);

        payment.employee(null);
        assertThat(payment.getEmployee()).isNull();
    }
}
