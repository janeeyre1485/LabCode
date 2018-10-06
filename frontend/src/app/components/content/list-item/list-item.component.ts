import {Component, Input, OnInit} from '@angular/core';
import {ListItem} from "../../../_model/listitem.model";

@Component({
  selector: 'list-item',
  templateUrl: './list-item.component.html',
  styleUrls: ['./list-item.component.css']
})
export class ListItemComponent implements OnInit {

  @Input()
  listItem: ListItem;

  constructor() { }

  ngOnInit() {
  }

}
