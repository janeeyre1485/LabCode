
export class StaticItem implements Item{

  text:string;
  examples: string;

  constructor(text: string, examples: string) {
    this.text = text;
    this.examples = examples;
  }

}
