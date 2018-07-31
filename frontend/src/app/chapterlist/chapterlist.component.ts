import {Component, OnInit} from '@angular/core';
import {Chapter} from "../model/chapter.model";
import {ChapterService} from "../shared/chapter/chapter.service";

@Component({
  selector: 'app-chapterclient',
  templateUrl: './chapterlist.component.html',
  styleUrls: ['./chapterlist.component.css']
})
export class ChapterlistComponent implements OnInit {

  chapters: Chapter[];

  constructor(private chapterService: ChapterService) { }

  ngOnInit() {
    this.chapterService.getAllChapters().subscribe(data=> {
      this.chapters = data;
    });

  }

  saveChapter(chapter: Chapter) {
    this.chapterService.save(chapter);
  }
}
