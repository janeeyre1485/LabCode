import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {HTTP_INTERCEPTORS, HttpClientModule} from '@angular/common/http';

import {AppComponent} from './app.component';
import {StaticItemComponent} from './components/content/staticitem/static-item.component';
import {DynamicItemComponent} from './components/content/dynamicitem/dynamic-item.component';
import {ContainerItemComponent} from './components/content/containeritem/container-item.component';
import {FormsModule} from "@angular/forms";
import {ChapterComponent} from './components/content/chapter/chapter.component';
import {AppRoutingModule} from './/app-routing.module';
import {ChaptersDashboardComponent} from './components/content/chaptersdashboard/chapters-dashboard.component';
import {LoginComponent} from './components/auth/login/login.component';
import {AuthService} from "./_service/auth.service";
import {UserService} from "./_service/user.service";
import {HomeComponent} from './components/home/home.component';
import {AuthGuard} from "./_guards/auth.guard";
import {AuthInterceptor} from "./_service/auth.interceptor";
import { RegistrationComponent } from './components/auth/registration/registration.component';


@NgModule({
  declarations: [
    AppComponent,
    StaticItemComponent,
    DynamicItemComponent,
    ContainerItemComponent,
    ChapterComponent,
    ChaptersDashboardComponent,
    LoginComponent,
    HomeComponent,
    RegistrationComponent],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [AuthService, UserService, AuthGuard, {
    provide: HTTP_INTERCEPTORS,
    useClass: AuthInterceptor,
    multi: true
  }],
  bootstrap: [AppComponent]
})

export class AppModule {
}
