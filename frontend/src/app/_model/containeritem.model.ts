import {Item} from "./item.model";

export class ContainerItem implements Item{

  style: string;
  items: Item[];

  constructor(items: Item[]){
    this.items = items;
  }

}
