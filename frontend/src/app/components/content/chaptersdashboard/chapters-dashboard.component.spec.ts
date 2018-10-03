import {async, ComponentFixture, TestBed} from '@angular/core/testing';
import { ChaptersDashboardComponent } from './chapters-dashboard.component';

describe('ChaptersDashboardComponent', () => {
  let component: ChaptersDashboardComponent;
  let fixture: ComponentFixture<ChaptersDashboardComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChaptersDashboardComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChaptersDashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
