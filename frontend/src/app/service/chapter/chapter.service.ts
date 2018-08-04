import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Chapter} from "../../model/chapter.model";



const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})
export class ChapterService {

  constructor(private http: HttpClient) {
  }

  getChapter(id) {
    return this.http.get<Chapter>('http://localhost:8080/chapters/' + id, httpOptions);

  }

  save(chapter) {
    let body = JSON.stringify(chapter);
    console.log(body);
    this.http.put('http://localhost:8080/chapters/', body, httpOptions).subscribe();
  }

  getChapters() {
    return this.http.get<Chapter[]>('http://localhost:8080/chapters/', httpOptions);

  }

}
