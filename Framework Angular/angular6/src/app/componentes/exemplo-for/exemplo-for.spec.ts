import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExemploFor } from './exemplo-for';

describe('ExemploFor', () => {
  let component: ExemploFor;
  let fixture: ComponentFixture<ExemploFor>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ExemploFor]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ExemploFor);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
