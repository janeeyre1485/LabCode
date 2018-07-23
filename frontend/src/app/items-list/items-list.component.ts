import {Component, OnInit} from '@angular/core';
import {ItemService} from "../shared";

@Component({
  selector: 'app-items-list',
  templateUrl: './items-list.component.html',
  styleUrls: ['./items-list.component.css'],
  providers: [ItemService]
})
export class ItemsListComponent implements OnInit {
  items:any[];

  constructor (private itemService: ItemService) {
  }

  ngOnInit() {
  this.itemService.getAll().subscribe(data => {
    this.items = data;
  });
  }



}
