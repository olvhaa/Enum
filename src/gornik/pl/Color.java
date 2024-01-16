package gornik.pl;

public enum Color {
    BLACK("czarny"),
    WHITE("biały"),
    RED("czerwony"),
    BLUE("niebieski"),
    GREEN("zielony");

    private String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
