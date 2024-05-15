import { IEmployee, NewEmployee } from './employee.model';

export const sampleWithRequiredData: IEmployee = {
  id: 27629,
};

export const sampleWithPartialData: IEmployee = {
  id: 23691,
  name: 'supervise ajar even',
  position: 'pay',
  department: 'subprime duh anxiously',
};

export const sampleWithFullData: IEmployee = {
  id: 12477,
  name: 'until pace righteously',
  position: 'atop',
  department: 'pepper',
  monthlySalary: 5116.98,
};

export const sampleWithNewData: NewEmployee = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
