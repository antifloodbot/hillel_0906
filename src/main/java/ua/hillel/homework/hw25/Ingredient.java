package ua.hillel.homework.hw25;

public enum Ingredient {
    SAUCE("Соус", 10),
    CHEESE("Сыр", 20),
    PATTY("Котлета", 30);

    private String name;
    private double price;

    Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static Ingredient findByName(String name) {
        for (Ingredient ingredient : values()) {
            if (ingredient.getName().equalsIgnoreCase(name)) {
                return ingredient;
            }
        }
        return null;
    }

    public static Ingredient findByNumber(int number) {
        for (Ingredient ingredient : values()) {
            if (ingredient.ordinal() + 1 == number) {
                return ingredient;
            }
        }
        return null;
    }
}
