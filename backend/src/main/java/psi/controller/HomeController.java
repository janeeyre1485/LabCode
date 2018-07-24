package psi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import psi.model.ContainerItem;
import psi.model.DynamicItem;
import psi.model.Item;
import psi.model.StaticItem;
import psi.service.ItemService;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")
public class HomeController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/add-item", method = RequestMethod.POST)
    public ResponseEntity<Item> createItem(@RequestBody Item item) {

        itemService.save(item);

        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public List<Item> getAllItems() {

        System.out.println("get all items");
        return itemService.findAll();
    }

    @RequestMapping(value="/update-item", method = RequestMethod.POST)
    public ResponseEntity<Item> updateItem(@RequestBody Item newItem){
        System.out.println("get something" + ((DynamicItem)newItem).getText());
        itemService.save(newItem);
        return new ResponseEntity<>(newItem,HttpStatus.OK);
    }

    @RequestMapping(value="/save-items", method = RequestMethod.PUT)
    public ResponseEntity<List<Item>> updateItem(@RequestBody List<Item> items){
        itemService.saveAll(items);
        return new ResponseEntity<>(items,HttpStatus.OK);
    }


}
