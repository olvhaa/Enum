package gornik.pl;

public class Shape {
    private String title;
    private Color color;

    public Shape(String title, Color color) {
        this.title = title;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "title='" + title + '\'' +
                ", color=" + color +
                '}';
    }
}
