package psi.model;

import java.util.List;
import java.util.Objects;

public class ContainerItem implements Item {

    private List<Item> items;

    public ContainerItem() {
        super();
    }

    public ContainerItem(List<Item> items) {
        super();
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ContainerItem{" +
                "items=" + items +
                '}';
    }

    public void addItem(Item item){
        items.add(item);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContainerItem that = (ContainerItem) o;
        return this.items.containsAll(that.items);
    }

    @Override
    public int hashCode() {

        return Objects.hash(items);
    }
}
