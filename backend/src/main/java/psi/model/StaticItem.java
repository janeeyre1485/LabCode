package psi.model;

public class StaticItem implements Item {
	
	private  String value;

	public StaticItem(String value) {
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
