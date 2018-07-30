import {Component, Input, OnInit} from '@angular/core';
import {ItemService} from "../shared";
import {Item} from "../model/item.model";

@Component({
  selector: 'app-items-list',
  templateUrl: './items-list.component.html',
  styleUrls: ['./items-list.component.css'],
  providers: [ItemService]
})
export class ItemsListComponent implements OnInit {
  @Input()
  items:Item[];

  constructor (private itemService: ItemService) {
  }

  ngOnInit() {
  this.itemService.getAll().subscribe(data => {
    this.items = data;
  });
  }

  saveItems(items){

      this.itemService.saveAll(items);

  }



}
