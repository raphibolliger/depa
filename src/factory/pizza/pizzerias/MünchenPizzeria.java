package factory.pizza.pizzerias;

import factory.pizza.Pizza;
import factory.pizza.PizzaZutatenFabrik;
import factory.pizza.Pizzeria;
import factory.pizza.pizzen.SalamiPizza;
import factory.pizza.zutatenFabriken.MünchenerPizzaZutatenFabrik;

public class MünchenPizzeria extends Pizzeria {

    @Override
    public Pizza erstellePizza(String typ) {

        Pizza pizza = null;
        PizzaZutatenFabrik pizzaZutatenFabrik = new MünchenerPizzaZutatenFabrik();

        if (typ.equals("Salami")){

            pizza = new SalamiPizza(pizzaZutatenFabrik);
            pizza.setName("Salamipizza Münchner Art");

        }

        return pizza;

    }

}
