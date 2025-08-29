import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Evento2 } from './evento2';

describe('Evento2', () => {
  let component: Evento2;
  let fixture: ComponentFixture<Evento2>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Evento2]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Evento2);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
