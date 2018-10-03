import {ContainerItem} from "./containeritem.model";

export class CheckItem {

  style: string;
  value: boolean = true;
  items: ContainerItem;

  constructor(value: boolean, items: ContainerItem) {
    this.value = value;
    this.items = items;
  }
}
