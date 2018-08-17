import {Component, Input, OnInit} from '@angular/core';
import {Chapter} from "../../../_model/chapter.model";
import {ActivatedRoute} from "@angular/router";
import {UserService} from "../../../_service/user.service";

@Component({
  selector: 'chapter',
  templateUrl: './chapter.component.html',
  styleUrls: ['./chapter.component.css']
})
export class ChapterComponent implements OnInit {

  @Input()
  chapter: Chapter;
  username: string;


  constructor(
    private userService: UserService,
    private route: ActivatedRoute) {
  }

  ngOnInit() {
    this.getChapter();
    this.username = JSON.parse(localStorage.getItem('currentUser')).username
  }

  save(chapter: Chapter) {
    this.userService.saveChapter(chapter)
  }

  getChapter() {
    const id = this.route.snapshot.paramMap.get("id");
    this.userService.getChapter(id).subscribe(data => {
      this.chapter = data;
    })
  }

}
