import {Item} from "./item.model";

export class DynamicItem implements Item{

  style: string;
  text: string;
  type: string;

  constructor(text: string, type: string) {
    this.text = text;
    this.type = type;
  }

}
