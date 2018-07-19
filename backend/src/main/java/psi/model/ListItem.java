package psi.model;

public class ListItem implements Item{
	private Integer order;
	private ContainerItem items;

	public ListItem(Integer order, ContainerItem items) {
		super();
		this.order = order;
		this.items = items;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public ContainerItem getItems() {
		return items;
	}

	public void setItems(ContainerItem items) {
		this.items = items;
	}

}
