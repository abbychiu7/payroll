import { IAuthority, NewAuthority } from './authority.model';

export const sampleWithRequiredData: IAuthority = {
  name: 'e3df41b3-ca9a-43cf-a6f9-e189c0fb7895',
};

export const sampleWithPartialData: IAuthority = {
  name: '7346146b-ebac-461f-931c-9d97b1934e91',
};

export const sampleWithFullData: IAuthority = {
  name: 'd910fd6d-f055-4027-94ac-57f8cd4c1aef',
};

export const sampleWithNewData: NewAuthority = {
  name: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
