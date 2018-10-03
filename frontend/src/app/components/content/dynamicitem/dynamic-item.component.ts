import {Component, Input, OnInit} from '@angular/core';
import {DynamicItem} from "../../../_model/dynamicitem.model";


@Component({
  selector: 'dynamic-item',
  templateUrl: './dynamic-item.component.html',
  styleUrls: ['./dynamic-item.component.css']
})
export class DynamicItemComponent implements OnInit {

  @Input()
  dynamicItem: DynamicItem;


  constructor() {

  }

  ngOnInit() {
  }






}
