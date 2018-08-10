import {Component, Input, OnInit} from '@angular/core';
import {StaticItem} from "../../model/staticitem.model";

@Component({
  selector: 'static-item',
  templateUrl: './static-item.component.html',
  styleUrls: ['./static-item.component.css']
})
export class StaticItemComponent implements OnInit {

  @Input()
  staticItem: StaticItem;

  constructor() {

  }

  ngOnInit() {
  }

}
