package model.enums;

public enum Manufacturer {
    SAMSUNG("Samsung"),
    APPLE("Apple"),
    OPPO("Oppo"),
    NOKIA("Nokia");

    private String value;

    Manufacturer(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
