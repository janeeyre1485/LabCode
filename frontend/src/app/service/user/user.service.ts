import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {User} from "../../model/user";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) {
  }

  createAccount(user: User) {
    return this.http.post("localhost:8080/signup", user)
      .subscribe();
  }
}
