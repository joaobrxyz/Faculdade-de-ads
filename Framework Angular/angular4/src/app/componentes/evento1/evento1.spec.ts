import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Evento1 } from './evento1';

describe('Evento1', () => {
  let component: Evento1;
  let fixture: ComponentFixture<Evento1>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Evento1]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Evento1);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
