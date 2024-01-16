package sex;

public enum Gender {
    MALE("Józef"),
    FEMALE("Krzysztofina"),
    AGENDER("Mariusz");

    private String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}