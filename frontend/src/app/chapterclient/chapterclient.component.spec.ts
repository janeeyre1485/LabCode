import {async, ComponentFixture, TestBed} from '@angular/core/testing';
import { ChapterClientComponent } from './chapterclient.component';

describe('ChapterClientComponent', () => {
  let component: ChapterClientComponent;
  let fixture: ComponentFixture<ChapterClientComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChapterClientComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChapterClientComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
