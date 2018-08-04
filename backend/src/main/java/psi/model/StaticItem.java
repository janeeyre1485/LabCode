package psi.model;

public class StaticItem implements Item {

    private String text;
    private String examples;

    public StaticItem() {
        super();
    }

    public StaticItem(String text, String examples) {
        this.text = text;
        this.examples = examples;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getExamples() {
        return examples;
    }

    public void setExamples(String examples) {
        this.examples = examples;
    }

}
