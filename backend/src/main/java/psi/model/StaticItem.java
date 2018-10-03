package psi.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StaticItem that = (StaticItem) o;
        return Objects.equals(text, that.text) &&
                Objects.equals(examples, that.examples);
    }

    @Override
    public int hashCode() {

        return Objects.hash(text, examples);
    }
}
