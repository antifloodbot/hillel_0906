package ua.hillel.homework.hw25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BurgerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Ingredient> selectedIngredients = new ArrayList<>();
        double totalCost = 50;

        while (true) {
            System.out.println("Выберите дополнительные ингредиенты для бургера:");
            for (Ingredient ingredient : Ingredient.values()) {
                System.out.println(ingredient.ordinal() + 1 + ". " + ingredient.getName() + " - " + ingredient.getPrice() + "$");
            }
            System.out.println("Введите номер ингредиента (или название, или 'нет' для завершения): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("нет")) {
                break;
            }

            Ingredient selectedIngredient = Ingredient.findByName(input);
            if (selectedIngredient != null) {
                selectedIngredients.add(selectedIngredient);
                totalCost += selectedIngredient.getPrice();
            } else {
                try {
                    int ingredientNumber = Integer.parseInt(input);
                    Ingredient byNumber = Ingredient.findByNumber(ingredientNumber);
                    if (byNumber != null) {
                        selectedIngredients.add(byNumber);
                        totalCost += byNumber.getPrice();
                    } else {
                        System.out.println("Некорректный номер ингредиента.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод. Введите номер ингредиента, название или 'нет'.");
                }
            }
        }
        System.out.println("Итоговая стоимость бургера: " + totalCost + "$");
    }
}
