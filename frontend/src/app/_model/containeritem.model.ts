import {Item} from "./item.model";

export class ContainerItem implements Item{

  items: Item[];

  constructor(items: Item[]){
    this.items = items;
  }

}
