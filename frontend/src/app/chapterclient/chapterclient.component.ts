import {Component, OnInit} from '@angular/core';
import {Chapter} from "../model/chapter.model";
import {ChapterService} from "../shared/chapter/chapter.service";

@Component({
  selector: 'app-chapterclient',
  templateUrl: './chapterclient.component.html',
  styleUrls: ['./chapterclient.component.css']
})
export class ChapterClientComponent implements OnInit {

  chaptercomp: Chapter;

  constructor(private chapterService: ChapterService) { }

  ngOnInit() {
    this.chapterService.getChapter("1").subscribe(data => {
      this.chaptercomp = new Chapter(data.id, data.title, data.items);
    });
  }

  saveChapter(chapter: Chapter) {
    this.chapterService.save(chapter);
  }
}
