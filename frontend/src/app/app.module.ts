import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {HttpClientModule} from '@angular/common/http';


import {AppComponent} from './app.component';
import {StaticItemComponent} from './component/staticitem/static-item.component';
import {DynamicItemComponent} from './component/dynamicitem/dynamic-item.component';
import {ContainerItemComponent} from './component/containeritem/container-item.component';
import {FormsModule} from "@angular/forms";
import { ChapterComponent } from './component/chapter/chapter.component';
import { AppRoutingModule } from './/app-routing.module';
import { ChaptersDashboardComponent } from './component/chaptersdashboard/chapters-dashboard.component';


@NgModule({
  declarations: [
    AppComponent,
    StaticItemComponent,
    DynamicItemComponent,
    ContainerItemComponent,
    ChapterComponent,
    ChaptersDashboardComponent],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule {
}
