import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormReativo } from './form-reativo';

describe('FormReativo', () => {
  let component: FormReativo;
  let fixture: ComponentFixture<FormReativo>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormReativo]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormReativo);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
