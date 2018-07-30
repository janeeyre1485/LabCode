package psi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import psi.model.ContainerItem;
import psi.model.Item;
import psi.service.ItemService;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")
public class ItemsController {

    @Autowired
    private ItemService itemService;


    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public List<Item> getAllItems() {

        System.out.println("get all items");
        return itemService.findAll();
    }

    @RequestMapping(value = "/update-item", method = RequestMethod.POST)
    public ResponseEntity<Item> updateItem(@RequestBody Item newItem) {
        itemService.save(newItem);
        return new ResponseEntity<>(newItem, HttpStatus.OK);
    }

    @RequestMapping(value = "/save-items", method = RequestMethod.PUT)
    public ResponseEntity<List<Item>> updateItem(@RequestBody List<Item> items) {
        itemService.saveAll(items);
        return new ResponseEntity<>(items, HttpStatus.OK);
    }

    @RequestMapping(value = "/items/{id}/add-item", method = RequestMethod.POST)
    public ResponseEntity<Item> getAllItems(@PathVariable String id, @RequestBody Item newItem) {

        Item targetItem = itemService.getItemById(id);
        if (targetItem instanceof ContainerItem) {
            ((ContainerItem) targetItem).addItem(newItem);
            itemService.save(targetItem);
            return new ResponseEntity<>(targetItem, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(targetItem, HttpStatus.BAD_REQUEST);
        }
    }


    @RequestMapping(value = "/items/{id}", method = RequestMethod.POST)
    public ResponseEntity<Item> getItem(@PathVariable String id) {

        return new ResponseEntity<>(itemService.getItemById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/items/{id}", method = RequestMethod.DELETE)
    public void deleteItem(@PathVariable String id) {

        itemService.delete(id);

    }
}
