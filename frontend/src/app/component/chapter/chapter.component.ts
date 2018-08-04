import {Component, Input, OnInit} from '@angular/core';
import {Chapter} from "../../model/chapter.model";
import {ChapterService} from "../../service/chapter/chapter.service";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'chapter',
  templateUrl: './chapter.component.html',
  styleUrls: ['./chapter.component.css']
})
export class ChapterComponent implements OnInit {

  @Input()
  chapter: Chapter;

  constructor(
    private chapterService: ChapterService,
    private route: ActivatedRoute) {
  }

  ngOnInit() {
    this.getChapter();
  }

  save(chapter: Chapter) {
    this.chapterService.save(chapter)
  }

  getChapter() {
    const id = this.route.snapshot.paramMap.get("id");
    this.chapterService.getChapter(id).subscribe(data => {
      this.chapter = data;
    })
  }

}
