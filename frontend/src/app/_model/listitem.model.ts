import {Item} from "./item.model";

export class ListItem {

  style:string;
  items: Item[];

  constructor(items: Item[]){
    this.items = items;
  }

}
