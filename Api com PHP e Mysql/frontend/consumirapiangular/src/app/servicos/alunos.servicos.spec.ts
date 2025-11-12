import { TestBed } from '@angular/core/testing';

import { AlunosServicos } from './alunos.servicos';

describe('AlunosServicos', () => {
  let service: AlunosServicos;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AlunosServicos);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
