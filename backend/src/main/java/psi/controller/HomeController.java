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


    @RequestMapping(value = "/add-static-item", method = RequestMethod.POST)
    public ResponseEntity<Item> createStaticItem(@RequestBody StaticItem item) {

        itemService.save(item);

        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/add-dynamic-item", method = RequestMethod.POST)
    public ResponseEntity<Item> createDynamicItem(@RequestBody DynamicItem item) {

        itemService.save(item);

        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/add-item", method = RequestMethod.POST)
    public ResponseEntity<Item> createItem(@RequestBody Item item) {

        itemService.save(item);

        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public List<Item> getAllItems() {

        return itemService.findAll();
    }

    @RequestMapping(value = "/add-container-item", method = RequestMethod.POST)
    public ResponseEntity<Item> addContainerItem(@RequestBody ContainerItem item) {

//        ContainerItem item = new ContainerItem();
//        StaticItem stitem = new StaticItem("fff","hhh");
//        DynamicItem dmitem = new DynamicItem("ddd");
//        item.setItems(Arrays.asList(stitem,dmitem));
        itemService.save(item);

        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }

}
