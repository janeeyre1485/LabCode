import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Chapter} from "../../model/chapter.model";



const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
    'Authorization': 'Basic ' + localStorage.getItem("token")
  })
};

@Injectable({
  providedIn: 'root'
})
export class ChapterService {

  constructor(private http: HttpClient) {
  }

  save(chapter) {
    let body = JSON.stringify(chapter);
    this.http.put('http://localhost:8080/chapters/', body, httpOptions).subscribe();
  }

  getChapters() {

    return this.http.get<Chapter[]>('http://localhost:8080/chapters/', httpOptions);
  }

  getChapter(id:string){

    return this.http.get<Chapter>('http://localhost:8080/chapters/' + id, httpOptions);
  }

}
