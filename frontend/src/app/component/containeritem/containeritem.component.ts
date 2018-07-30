import {Component, Input, OnInit} from '@angular/core';
import {ContainerItem} from "../../model/containeritem.model";

@Component({
  selector: 'app-containeritem',
  templateUrl: './containeritem.component.html',
  styleUrls: ['./containeritem.component.css']
})
export class ContaineritemComponent implements OnInit {

  @Input()
  containerItem: ContainerItem;

  constructor(){}

  ngOnInit() {

  }


}
