import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {HttpClientModule} from '@angular/common/http';


import {AppComponent} from './app.component';
import {ItemsListComponent} from './items-list/items-list.component';
import { AddItemComponent } from './add-item/add-item.component';


@NgModule({
  declarations: [
    AppComponent,
    ItemsListComponent,
    AddItemComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule {
}
