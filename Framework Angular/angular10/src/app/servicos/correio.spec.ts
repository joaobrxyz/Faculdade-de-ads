import { TestBed } from '@angular/core/testing';

import { Correio } from './correio';

describe('Correio', () => {
  let service: Correio;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Correio);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
