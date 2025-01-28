package by.rublevskaya.model.pattern.pizzeria.pizza1;

public interface PizzaBuilder {
    PizzaBuilder size(String size);
    PizzaBuilder crust(String crust);
    PizzaBuilder cheese(boolean cheese);
    PizzaBuilder pepperoni(boolean pepperoni);
    PizzaBuilder mushrooms(boolean mushrooms);
    PizzaBuilder olives(boolean olives);
    Pizza build();
}
