import { IEmployee } from 'app/entities/employee/employee.model';

export interface IPayment {
  id: number;
  payMonth?: number | null;
  payYear?: number | null;
  monthlySalary?: number | null;
  deductions?: number | null;
  netPay?: number | null;
  employee?: IEmployee | null;
}

export type NewPayment = Omit<IPayment, 'id'> & { id: null };
