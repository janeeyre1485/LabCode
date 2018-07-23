import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {HttpClientModule} from '@angular/common/http';


import {AppComponent} from './app.component';
import {ItemsListComponent} from './items-list/items-list.component';
import { StaticitemComponent } from './component/staticitem/staticitem.component';
import { DynamicitemComponent } from './component/dynamicitem/dynamicitem.component';
import { ContaineritemComponent } from './component/containeritem/containeritem.component';


@NgModule({
  declarations: [
    AppComponent,
    ItemsListComponent,
    StaticitemComponent,
    DynamicitemComponent,
    ContaineritemComponent
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
