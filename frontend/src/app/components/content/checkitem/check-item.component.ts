import {Component, Input, OnInit} from '@angular/core';
import {CheckItem} from "../../../_model/checkitem.model";

@Component({
  selector: 'check-item',
  templateUrl: './check-item.component.html',
  styleUrls: ['./check-item.component.css']
})
export class CheckItemComponent implements OnInit {

  @Input()
  checkItem: CheckItem;

  constructor() { }

  ngOnInit() {
  }

}
