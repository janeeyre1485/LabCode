import {Component, OnInit} from '@angular/core';
import {User} from "../../../_model/user";
import {AuthService} from "../../../_service/auth.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  user: User = new User(null ,'' ,'','');


  constructor(private authService: AuthService, private router: Router) {
  }

  ngOnInit() {
  }

  public registerUser() {
    this.authService.registerUser(this.user).subscribe(()=>
    {
      this.router.navigate(["/login"]).then();
    });
  }

}
