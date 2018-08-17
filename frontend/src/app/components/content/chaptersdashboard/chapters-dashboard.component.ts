import {Component, Input, OnInit} from '@angular/core';
import {Chapter} from "../../../_model/chapter.model";
import {AuthService} from "../../../_service/auth.service";
import {Router} from "@angular/router";
import {UserService} from "../../../_service/user.service";

@Component({
  selector: 'chapters-dashboard',
  templateUrl: './chapters-dashboard.component.html',
  styleUrls: ['./chapters-dashboard.component.css']
})
export class ChaptersDashboardComponent implements OnInit {

  @Input()
  chapters: Chapter[];

  constructor(private userService: UserService, private authService: AuthService, private router: Router) {
  }


  logout() {
    this.authService.logout().subscribe(data => {

      this.router.navigate(["/login"]).then();

    });
  }

  ngOnInit() {

    this.userService.getAllChapters().subscribe(data => {
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
