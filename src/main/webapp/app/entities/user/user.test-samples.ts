import { IUser } from './user.model';

export const sampleWithRequiredData: IUser = {
  id: 25736,
  login: '20DV@7-\\HEK\\CNvZbQ\\JsA\\yI8frL0',
};

export const sampleWithPartialData: IUser = {
  id: 17089,
  login: '_gv@4MF4H\\C2B1\\Q1\\PkiZGUr\\)Vn\\IY6EVo',
};

export const sampleWithFullData: IUser = {
  id: 13025,
  login: '4qv',
};
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
