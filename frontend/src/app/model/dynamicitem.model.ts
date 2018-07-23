import {Item} from "./item.model";

export class DynamicItem implements Item{
  text: string;

  constructor(text: string) {
    this.text = text;
  }

}
