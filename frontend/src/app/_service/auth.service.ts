import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {User} from "../_model/user";
import {Observable} from "rxjs/internal/Observable";
import {AppComponent} from "../app.component";

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) {
  }

  public login(user: User): Promise<any> {

    let promise = new Promise((resolve, reject) => {

      var base64Credential: string = btoa(user.username + ':' + user.password);
      localStorage.setItem('token', base64Credential);

      console.log(base64Credential)
      this.http.get(AppComponent.API_URL + "/login").subscribe((response: Response) => {
          if (response['username'] != null) {
            localStorage.setItem('currentUser', JSON.stringify(response));
            resolve();
          }
        },
        () => {
          reject();
        }
      );
    });
    return promise;
  }

  public logout(): Observable<any> {
    localStorage.removeItem('token');
    localStorage.removeItem('currentUser');
    return this.http.post(AppComponent.API_URL + '/logout', {});
  }

  public getCurrentUser(): User {
    return JSON.parse(localStorage.getItem('currentUser'))
  }

  public getToken() {
    return localStorage.getItem('token')
  }

  public registerUser(user: User):Observable<any> {
    let body = JSON.stringify(user);


    let httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    };
    return this.http.post(AppComponent.API_URL + "/signup", body, httpOptions)
  }
}
