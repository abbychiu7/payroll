import { IPayment, NewPayment } from './payment.model';

export const sampleWithRequiredData: IPayment = {
  id: 31712,
};

export const sampleWithPartialData: IPayment = {
  id: 3474,
  payMonth: 18092,
  payYear: 27769,
  deductions: 22817.07,
};

export const sampleWithFullData: IPayment = {
  id: 31800,
  payMonth: 30219,
  payYear: 23267,
  monthlySalary: 17134.41,
  deductions: 27558.33,
  netPay: 1860.34,
};

export const sampleWithNewData: NewPayment = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
