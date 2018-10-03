package psi.model;

import java.util.ArrayList;

public class Chapter {
    private String id;
    private String title;
    private ArrayList<Item> items;

    public Chapter() {
        super();
        items = new ArrayList<>();
    }

    public Chapter(String id, String title, ArrayList<Item> items) {
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

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", items=" + items +
                '}';
    }
}
