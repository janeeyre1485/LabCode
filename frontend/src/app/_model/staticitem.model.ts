import {Item} from "./item.model";

export class StaticItem implements Item{

  text:string;
  examples: string;
  type: string;

  constructor(text: string, examples: string, type: string) {
    this.text = text;
    this.examples = examples;
    this.type = type;
  }

}
