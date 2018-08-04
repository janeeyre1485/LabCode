import {NgModule} from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {ChaptersDashboardComponent} from "./component/chaptersdashboard/chapters-dashboard.component";
import {ChapterComponent} from "./component/chapter/chapter.component";

const routes: Routes = [
  {path: "chapters", component: ChaptersDashboardComponent},
  {path: "chapters/:id", component: ChapterComponent}

];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]

})
export class AppRoutingModule {
}
