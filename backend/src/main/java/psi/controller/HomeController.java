package psi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import psi.model.Item;
import psi.model.StaticItem;
import psi.service.ItemService;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")
public class HomeController {

    @Autowired
    private ItemService itemService;


    @RequestMapping(value = "/add-static-item", method = RequestMethod.POST)
    public ResponseEntity<Item> createItem(@RequestBody StaticItem item) {

        itemService.save(item);

        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public List<Item> getAllItems() {

        return itemService.findAll();
    }

}
