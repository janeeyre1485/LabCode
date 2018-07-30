package psi.model;

import java.util.List;

public class ContainerItem implements Item{
	private List<Item> items;
private String id;
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
	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}
}
