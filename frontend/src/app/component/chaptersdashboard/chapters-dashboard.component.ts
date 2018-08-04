import {Component, Input, OnInit} from '@angular/core';
import {Chapter} from "../../model/chapter.model";
import {ChapterService} from "../../service/chapter/chapter.service";

@Component({
  selector: 'chapters-dashboard',
  templateUrl: './chapters-dashboard.component.html',
  styleUrls: ['./chapters-dashboard.component.css']
})
export class ChaptersDashboardComponent implements OnInit {

  @Input()
  chapters: Chapter[];
  constructor(private chapterService: ChapterService) { }

  ngOnInit() {
    this.chapterService.getChapters().subscribe(data => {
      this.chapters = data;
      this.chapters.sort((a, b) => {
          if (a.id < b.id)
            return -1;
          if (a.id > b.id)
            return 1;
          return 0;
        });

    });
  }


}
