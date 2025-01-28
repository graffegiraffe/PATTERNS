package by.rublevskaya.model.pattern.pizzeria.pizza2;

import java.util.Scanner;

public class PizzaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the pizza ordering app");

        System.out.println("Choose the pizza size (small, medium, large):");
        String size = scanner.nextLine();

        System.out.println("Choose the type of crust (thin, thick):");
        String crust = scanner.nextLine();

        System.out.println("Add cheese? (true/false):");
        boolean cheese = scanner.nextBoolean();

        System.out.println("Add pepperoni? (true/false):");
        boolean pepperoni = scanner.nextBoolean();

        System.out.println("Add mushrooms? (true/false):");
        boolean mushrooms = scanner.nextBoolean();

        System.out.println("Add olives? (true/false):");
        boolean olives = scanner.nextBoolean();

        Pizza pizza = Pizza.builder()
                .size(size)
                .crust(crust)
                .cheese(cheese)
                .pepperoni(pepperoni)
                .mushrooms(mushrooms)
                .olives(olives)
                .build();
        scanner.close();
        System.out.println("Your order: " + pizza);
    }
}