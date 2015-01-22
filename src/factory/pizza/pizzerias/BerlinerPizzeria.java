package factory.pizza.pizzerias;

import factory.pizza.Pizza;
import factory.pizza.PizzaZutatenFabrik;
import factory.pizza.Pizzeria;
import factory.pizza.pizzen.SalamiPizza;
import factory.pizza.zutatenFabriken.BerlinerPizzaZutatenFabrik;

public class BerlinerPizzeria extends Pizzeria {

    @Override
    public Pizza erstellePizza(String typ) {

        Pizza pizza = null;
        PizzaZutatenFabrik pizzaZutatenFabrik = new BerlinerPizzaZutatenFabrik();

        if (typ.equals("Salami")){

            pizza = new SalamiPizza(pizzaZutatenFabrik);
            pizza.setName("Salamipizza Berliner Art");

        }

        return pizza;

    }
}
