import { IEmployee, NewEmployee } from './employee.model';

export const sampleWithRequiredData: IEmployee = {
  id: 27101,
};

export const sampleWithPartialData: IEmployee = {
  id: 9871,
  position: 'amidst seriously where',
  department: 'ack support gracefully',
  monthlySalary: 17310.19,
};

export const sampleWithFullData: IEmployee = {
  id: 16146,
  name: 'down',
  position: 'solidly silently',
  department: 'defenseless',
  monthlySalary: 26680.96,
};

export const sampleWithNewData: NewEmployee = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
