package psi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import psi.model.Item;
import psi.model.StaticItem;
import psi.service.ItemService;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private ItemService itemService;
	


	@RequestMapping(value = "/add-static-item", method = RequestMethod.POST)
	public ResponseEntity<Item> createItem(@RequestBody StaticItem item) {

		itemService.save(item);

		return new ResponseEntity<>(item, HttpStatus.CREATED);
	}
}
