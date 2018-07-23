package psi.model;

import java.util.List;

public class ContainerItem implements Item{
	private List<Item> items;

	public ContainerItem(){
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
}
