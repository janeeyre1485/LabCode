import {Item} from "./item.model";

export class Chapter {
  items: Item[];
  id: string;
  title: string;

  constructor(chapter: any) {
    // this.items = items;
    // this.id = id;
    // this.title = title;

    this.items = chapter.items;
    this.id = chapter.id;
    this.title = chapter.title;
  }



}
