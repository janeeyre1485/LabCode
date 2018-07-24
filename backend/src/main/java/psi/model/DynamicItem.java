package psi.model;

public class DynamicItem implements Item {

    private String id;
    private String text;

    public DynamicItem() {
        super();
    }

    public DynamicItem(String text) {
        super();
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
