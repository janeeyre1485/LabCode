package psi.service;

import psi.model.Item;

import java.util.List;

public interface ItemService {

    void save(Item item);

    List<Item> findAll();
}
