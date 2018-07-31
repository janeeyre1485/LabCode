import {Component, Input, OnInit} from '@angular/core';
import {Chapter} from "../../model/chapter.model";
import {ChapterService} from "../../shared/chapter/chapter.service";

@Component({
  selector: 'app-chapter',
  templateUrl: './chapter.component.html',
  styleUrls: ['./chapter.component.css']
})
export class ChapterComponent implements OnInit {

  @Input()
  chapter: Chapter;

  constructor(private chapterService: ChapterService)  {
  }

  ngOnInit() {

  }

  saveChapter(){
    this.chapterService.save(this.chapter);
  }

}
