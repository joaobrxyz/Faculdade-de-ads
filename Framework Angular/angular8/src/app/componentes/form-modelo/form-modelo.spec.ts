import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormModelo } from './form-modelo';

describe('FormModelo', () => {
  let component: FormModelo;
  let fixture: ComponentFixture<FormModelo>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormModelo]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormModelo);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
