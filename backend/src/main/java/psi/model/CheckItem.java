package psi.model;

import java.util.Objects;

public class CheckItem implements Item {

	private String style;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CheckItem checkItem = (CheckItem) o;
		return value == checkItem.value &&
				Objects.equals(items, checkItem.items);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value, items);
	}

	@Override
	public String getStyle() {
		return style;
	}

	@Override
	public void setStyle(String style) {
		this.style = style;
	}
}
