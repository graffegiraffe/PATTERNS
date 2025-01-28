package by.rublevskaya.model.pattern.pizzeria.pizza1;

public class Pizza {
    private final String size;
    private final String crust;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean mushrooms;
    private final boolean olives;

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.crust = builder.crust;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
        this.olives = builder.olives;
    }

    public static class Builder implements PizzaBuilder {
        private String size;
        private String crust;
        private boolean cheese;
        private boolean pepperoni;
        private boolean mushrooms;
        private boolean olives;

        @Override
        public Builder size(String size) {
            this.size = size;
            return this;
        }

        @Override
        public Builder crust(String crust) {
            this.crust = crust;
            return this;
        }

        @Override
        public Builder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        @Override
        public Builder pepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        @Override
        public Builder mushrooms(boolean mushrooms) {
            this.mushrooms = mushrooms;
            return this;
        }

        @Override
        public Builder olives(boolean olives) {
            this.olives = olives;
            return this;
        }

        @Override
        public Pizza build() {
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", crust='" + crust + '\'' +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", mushrooms=" + mushrooms +
                ", olives=" + olives +
                '}';
    }
}