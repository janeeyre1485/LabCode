import {Item} from "./item.model";

export class Chapter {
  items: Item[];
  id: string;
  title: string;

  constructor(id: string, title: string, items: Item[]) {
    this.items = items;
    this.id = id;
    this.title = title;
  }

}
