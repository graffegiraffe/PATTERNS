package by.rublevskaya.model.pattern.pizzeria.pizza1;

import java.util.Scanner;

public class PizzaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pizza.Builder builder = new Pizza.Builder();

        System.out.println("Welcome to the pizza ordering app");
        System.out.println("Choose the pizza size (small, medium, large):");

        String size = scanner.nextLine();
        builder.size(size);

        System.out.println("Choose the type of crust (thin, thick):");
        String crust = scanner.nextLine();
        builder.crust(crust);

        System.out.println("Add cheese? (true/false):");
        boolean cheese = scanner.nextBoolean();
        builder.cheese(cheese);

        System.out.println("Add pepperoni? (true/false):");
        boolean pepperoni = scanner.nextBoolean();
        builder.pepperoni(pepperoni);

        System.out.println("Add mushrooms? (true/false):");
        boolean mushrooms = scanner.nextBoolean();
        builder.mushrooms(mushrooms);

        System.out.println("Add olives? (true/false):");
        boolean olives = scanner.nextBoolean();
        builder.olives(olives);

        Pizza pizza = builder.build();
        System.out.println("Your order: " + pizza);
        scanner.close();
    }
}
