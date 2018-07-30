package psi.model;

public class DualItem implements Item {

	private String value;
	private String option1;
	private String option2;
	private ContainerItem items;

	public DualItem(String value, String option1, String option2, ContainerItem items) {
		super();
		this.value = value;
		this.option1 = option1;
		this.option2 = option2;
		this.items = items;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public ContainerItem getItems() {
		return items;
	}

	public void setItems(ContainerItem items) {
		this.items = items;
	}

}
