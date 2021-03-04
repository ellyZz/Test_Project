package model.enums;

public enum ShelfLife {
    ONE_YEAR(1),
    TWO_YEARS(2),
    THREE_YEARS(3),
    FOUR_YEARS(4),
    FIVE_YEARS(5);

    private int value;

    ShelfLife(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
