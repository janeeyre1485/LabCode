import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/internal/Observable";

@Injectable()
export class ItemService {

  constructor(private  http: HttpClient) {
  }

  getAll(): Observable<any> {
    return this.http.get('http://localhost:8080/items');
  }

}
