export interface IEmployee {
  id: number;
  name?: string | null;
  position?: string | null;
  department?: string | null;
  monthlySalary?: number | null;
}

export type NewEmployee = Omit<IEmployee, 'id'> & { id: null };
