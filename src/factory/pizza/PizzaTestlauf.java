package factory.pizza;

import factory.pizza.pizzerias.BerlinerPizzeria;
import factory.pizza.pizzerias.MünchenPizzeria;

public class PizzaTestlauf {

    public static void main(String[] args){
        Pizzeria berlinerPizzeria = new BerlinerPizzeria();
        Pizzeria münchnerPizzeria = new MünchenPizzeria();

        Pizza pizza = berlinerPizzeria.bestellePizza("Salami");
        System.out.println("Ben hat eine " + pizza.getName() + " bestellt \n");

        pizza = münchnerPizzeria.bestellePizza("Salami");
        System.out.println("Tassilo hat eine " + pizza.getName() + " bestellt \n");

    }

}
