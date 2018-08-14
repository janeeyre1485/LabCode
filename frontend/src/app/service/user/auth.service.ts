import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {RequestOptions} from "@angular/http";
import {User} from "../../model/user";

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) {
  }

  public logIn(user: User) {

    var base64Credential: string = btoa(user.username + ':' + user.password);

    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/x-www-form-urlencoded',
        "Authorization": "Basic " + base64Credential

      })
    };
    return this.http.get("http://localhost:8080/login", httpOptions);

  }
}
