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

    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    };
    httpOptions.headers.append('Accept', 'application/json');

    // creating base64 encoded String from user name and password
    var base64Credential: string = btoa(user.username + ':' + user.password);
    httpOptions.headers.append("Authorization", "Basic " + base64Credential);

    console.log("bla bla: " + base64Credential);
    return this.http.get("http://localhost:8080/login", httpOptions);

  }
}
