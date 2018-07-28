package psi.model;

public class DynamicItem implements Item {

	private String value;

	public DynamicItem(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
