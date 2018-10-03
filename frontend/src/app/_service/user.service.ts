import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {User} from "../_model/user";
import {Chapter} from "../_model/chapter.model";
import {AuthService} from "./auth.service";
import {AppComponent} from "../app.component";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private usersPath = AppComponent.API_URL + "/users"

  constructor(private http: HttpClient, private authService: AuthService) {

  }

  createAccount(user: User) {
    return this.http.post("localhost:8080/sign-up", user)
      .subscribe();
  }

  getAllChapters() {
    return this.http.get<Chapter[]>(this.usersPath + "/" + this.authService.getCurrentUser().id + "/chapters");
  }

  saveChapter(chapter) {
    let body = JSON.stringify(chapter);
    let httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    };
    this.http.put(this.usersPath + "/" + this.authService.getCurrentUser().id + "/chapters", body, httpOptions).subscribe();
  }

  getChapter(id: string) {
    return this.http.get<Chapter>(this.usersPath + "/" + this.authService.getCurrentUser().id + "/chapters/" + id);
  }

}

