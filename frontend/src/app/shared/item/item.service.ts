import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Item} from "../../model/item.model";

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json'
  })};

@Injectable()
export class ItemService {

  constructor(private  http: HttpClient) {
  }

  getAll(){
    return this.http.get<Item[]>('http://localhost:8080/items');
  }

  saveAll(items: any[]){
    let body = JSON.stringify(items);
    this.http.put('http://localhost:8080/save-items',body,httpOptions).subscribe();

  }


}
