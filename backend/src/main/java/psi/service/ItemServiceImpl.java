package psi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import psi.model.Item;
import psi.persistence.ItemRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public void save(Item item) {
		itemRepository.save(item);
		
	}

    @Override
    public void delete(String id) {
        itemRepository.delete(getItemById(id));
    }

    @Override
	public List<Item> findAll() {
		return itemRepository.findAll();
	}

	@Override
	public List<Item> saveAll(List<Item> items) {
		return itemRepository.saveAll(items);
	}

	@Override
	public Item getItemById(String id) {
        return itemRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException());

	}


}
