package basic;

public enum Ordinal {
    APPLE, ORANGE, BANANA;

    public int numberOfFruits() { return ordinal() + 1; }
}