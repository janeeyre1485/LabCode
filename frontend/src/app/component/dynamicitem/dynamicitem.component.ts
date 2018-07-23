import {Component, Input, OnInit} from '@angular/core';
import {DynamicItem} from "../../model/dynamicitem.model";

@Component({
  selector: 'app-dynamicitem',
  templateUrl: './dynamicitem.component.html',
  styleUrls: ['./dynamicitem.component.css']
})
export class DynamicitemComponent implements OnInit {

  @Input()
  dynamicItem: DynamicItem;

  constructor() { }

  ngOnInit() {
  }

}
