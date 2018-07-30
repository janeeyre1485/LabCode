import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ContaineritemComponent } from './containeritem.component';

describe('ContaineritemComponent', () => {
  let component: ContaineritemComponent;
  let fixture: ComponentFixture<ContaineritemComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ContaineritemComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ContaineritemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
