package ua.hillel.homework.hw25option2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Burger {

    private List<Ingredient> ingredientList;
    private final double BASE_BURGER_PRICE = 50.0;
    private List<Ingredient> selectedIngredients = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Burger() {
        ingredientList = new ArrayList<>();
        ingredientList.add(new Ingredient("Соус", 10.0));
        ingredientList.add(new Ingredient("Сыр", 20.0));
        ingredientList.add(new Ingredient("Котлета", 30.0));
    }

    public void userInteraction() {
        String continueChoice;
        do {
            showIngredients();
            System.out.println("Введите номер ингредиента, название или 'нет' для завершения выбора.");
            String choice = scanUserInput();

            if (!choice.equals("нет")) {
                addIngredient(choice);
                System.out.println("Хотите добавить еще один ингредиент? (да/нет)");
                continueChoice = scanner.nextLine().trim().toLowerCase();

                while (!continueChoice.equals("да") && !continueChoice.equals("нет")) {
                    System.out.println("Вы ввели некорректное значение. Введите 'да' или 'нет'.");
                    continueChoice = scanner.nextLine().trim().toLowerCase();
                }

            } else {
                continueChoice = "нет";
            }

        } while (!continueChoice.equals("нет"));
        calculateTotalPrice();
    }

    public void showIngredients() {
        System.out.println("Выберите ингредиенты для бургера (по названию или номеру):");
        for (int i = 0; i < ingredientList.size(); i++) {
            System.out.println((i + 1) + ". " + ingredientList.get(i).getName() + " - " + ingredientList.get(i).getPrice() + "$");
        }
    }

    public String scanUserInput() {
        return scanner.nextLine().trim().toLowerCase();
    }

    public void addIngredient(String choice) {
        try {
            int index = Integer.parseInt(choice) - 1;
            if (index >= 0 && index < ingredientList.size()) {
                selectedIngredients.add(ingredientList.get(index));
                System.out.println("Добавлено: " + ingredientList.get(index).getName() + " за " + ingredientList.get(index).getPrice() + "$");
            } else {
                System.out.println("Ингредиент с таким номером не найден.");
            }
        } catch (NumberFormatException e) {
            boolean ingredientFound = false;
            for (Ingredient ingredient : ingredientList) {
                if (ingredient.getName().toLowerCase().equals(choice)) {
                    selectedIngredients.add(ingredient);
                    System.out.println("Добавлено: " + ingredient.getName() + " за " + ingredient.getPrice() + "$");
                    ingredientFound = true;
                    break;
                }
            }
            if (!ingredientFound) {
                System.out.println("Ингредиент с таким названием не найден.");
            }
        }
    }

    public void calculateTotalPrice() {
        double total = BASE_BURGER_PRICE;
        System.out.println("\nВаш заказ:");
        System.out.println("Базовый бургер - " + BASE_BURGER_PRICE + "$");
        for (Ingredient ingredient : selectedIngredients) {
            System.out.println(ingredient.getName() + " - " + ingredient.getPrice() + "$");
            total += ingredient.getPrice();
        }
        System.out.println("Общая стоимость заказа: " + total + "$");
    }
}