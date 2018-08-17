import {Component, Input, OnInit} from '@angular/core';
import {ContainerItem} from "../../../_model/containeritem.model";

@Component({
  selector: 'container-item',
  templateUrl: './container-item.component.html',
  styleUrls: ['./container-item.component.css']
})
export class ContainerItemComponent implements OnInit {

  @Input()
  containerItem: ContainerItem;

  constructor(){}

  ngOnInit() {

  }


}
