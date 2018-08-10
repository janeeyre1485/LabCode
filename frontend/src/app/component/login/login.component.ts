import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {User} from "../../model/user";
import {AuthService} from "../../service/user/auth.service";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user: User = new User();
  errorMessage:string;

  constructor(private authService: AuthService, private router: Router) {
  }

  login() {
    this.authService.logIn(this.user).subscribe((data: Response) => {
      if (data['name'] != null) {

        console.log("Logged in user: " + data['name']);
        this.router.navigate(["/chapters"]);
      }
      else{
          this.errorMessage = "Credentials incorrect"
      }
    })
    ;

  }

  ngOnInit(): void {
  }

}
