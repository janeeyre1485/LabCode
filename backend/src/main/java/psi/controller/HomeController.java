package psi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import psi.model.Item;
import psi.model.StaticItem;
import psi.service.ItemService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value = "/add-static-item", method = RequestMethod.POST)
	public String addItem() {
		Item item = new StaticItem("initial text");
		itemService.save(item);
		return "added";
	}
}
