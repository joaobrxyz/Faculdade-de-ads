import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormCep } from './form-cep';

describe('FormCep', () => {
  let component: FormCep;
  let fixture: ComponentFixture<FormCep>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormCep]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormCep);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
