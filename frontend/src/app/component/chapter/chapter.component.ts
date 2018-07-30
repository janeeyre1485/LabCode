import {Component, Input, OnInit} from '@angular/core';
import {Chapter} from "../../model/chapter.model";

@Component({
  selector: 'app-chapter',
  templateUrl: './chapter.component.html',
  styleUrls: ['./chapter.component.css']
})
export class ChapterComponent implements OnInit {

  @Input()
  chapter: Chapter;

  constructor()  {
  }

  ngOnInit() {

  }

}
