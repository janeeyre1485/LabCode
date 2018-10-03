import {NgModule} from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {ChaptersDashboardComponent} from "./components/content/chaptersdashboard/chapters-dashboard.component";
import {ChapterComponent} from "./components/content/chapter/chapter.component";
import {LoginComponent} from "./components/auth/login/login.component";
import {HomeComponent} from "./components/home/home.component";
import {AuthGuard} from "./_guards/auth.guard";
import {RegistrationComponent} from "./components/auth/registration/registration.component";

const routes: Routes = [
  {path: "chapters", component: ChaptersDashboardComponent, canActivate: [AuthGuard]},
  {path: "chapters/:id", component: ChapterComponent},
  {path: 'login', component: LoginComponent},
  {path: 'home', component: HomeComponent},
  {path: 'sign-up', component: RegistrationComponent},
  {path: '', component: HomeComponent},
  { path: '**', redirectTo: '/login' }

];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]

})
export class AppRoutingModule {
}
