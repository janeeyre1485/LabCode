package psi.model;

public class CheckItem implements Item {

//	private String id;
	private boolean value;
	private ContainerItem items;


	public CheckItem(boolean value, ContainerItem items) {
		super();
		this.value = value;
		this.items = items;
	}

	public boolean isValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}

	public ContainerItem getItems() {
		return items;
	}

	public void setItems(ContainerItem items) {
		this.items = items;
	}
//	@Override
//	public String getId() {
//		return id;
//	}
//
//	@Override
//	public void setId(String id) {
//		this.id = id;
//	}

}
