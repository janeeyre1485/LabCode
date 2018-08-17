import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {User} from "../../../_model/user";
import {AuthService} from "../../../_service/auth.service";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user: User = new User(null ,'' ,'','');
  errorMessage: string;

  constructor(private authService: AuthService, private router: Router) {
  }

  login() {

    this.authService.login(this.user).then(() => {
      this.router.navigate(["/chapters"]).then();
    }, () => {
      this.errorMessage = "Invalid credentials"
    })
  }

  ngOnInit(): void {
    if (localStorage.getItem('token') != null) {
      this.router.navigate(["/chapters"]).then();
    }
  }

}
