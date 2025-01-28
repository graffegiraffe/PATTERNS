package by.rublevskaya.model.pattern.pizzeria.pizza2;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Pizza {
    private final String size;
    private final String crust;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean mushrooms;
    private final boolean olives;
}