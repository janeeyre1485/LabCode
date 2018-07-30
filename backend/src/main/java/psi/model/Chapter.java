package psi.model;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String id;
    private String title;
    private List<Item> items;

    public Chapter() {
        super();
        items = new ArrayList<>();

    }

    public Chapter(String id, String title, List<Item> items) {
        this.id = id;
        this.title = title;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item){
        this.items.add(item);
    }
}
