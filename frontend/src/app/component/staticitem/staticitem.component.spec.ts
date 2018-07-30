import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {StaticitemComponent} from './staticitem.component';

describe('StaticitemComponent', () => {
  let component: StaticitemComponent;
  let fixture: ComponentFixture<StaticitemComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StaticitemComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StaticitemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
