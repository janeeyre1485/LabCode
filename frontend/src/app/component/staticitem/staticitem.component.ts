import {Component, Input, OnInit} from '@angular/core';
import {StaticItem} from "../../model/staticitem.model";

@Component({
  selector: 'app-staticitem',
  templateUrl: './staticitem.component.html',
  styleUrls: ['./staticitem.component.css']
})
export class StaticitemComponent implements OnInit {

  @Input()
  staticItem: StaticItem;

  constructor() {

  }

  ngOnInit() {
  }

}
