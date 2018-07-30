package psi.service;

import psi.model.Item;

import java.util.List;

public interface ItemService {

    void save(Item item);

    void delete(String id);

    List<Item> findAll();

    List<Item> saveAll(List<Item> items);

    Item getItemById(String id);

}
