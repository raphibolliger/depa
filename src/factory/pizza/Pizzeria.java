package factory.pizza;

import factory.pizza.Pizza;

public abstract class Pizzeria {

    public Pizza bestellePizza(String typ){

        Pizza pizza = erstellePizza(typ);

        pizza.vorbereiten();
        pizza.backen();
        pizza.schneiden();
        pizza.einpacken();

        return pizza;

    }

    public abstract Pizza erstellePizza(String typ);

}
