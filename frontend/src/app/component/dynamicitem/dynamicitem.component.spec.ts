import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DynamicitemComponent } from './dynamicitem.component';

describe('DynamicitemComponent', () => {
  let component: DynamicitemComponent;
  let fixture: ComponentFixture<DynamicitemComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DynamicitemComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DynamicitemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
