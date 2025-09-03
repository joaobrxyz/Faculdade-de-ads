import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DuasVias } from './duas-vias';

describe('DuasVias', () => {
  let component: DuasVias;
  let fixture: ComponentFixture<DuasVias>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DuasVias]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DuasVias);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
