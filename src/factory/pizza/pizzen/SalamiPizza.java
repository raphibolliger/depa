package factory.pizza.pizzen;

import factory.pizza.Pizza;
import factory.pizza.PizzaZutatenFabrik;

public class SalamiPizza extends Pizza {

    PizzaZutatenFabrik pizzaZutatenFabrik;

    public SalamiPizza(PizzaZutatenFabrik pizzaZutatenFabrik){
        this.pizzaZutatenFabrik = pizzaZutatenFabrik;
    }

    @Override
    public void vorbereiten() {
        System.out.println("Mache " + name);
        teig = pizzaZutatenFabrik.erstelleTeig();
        sosse = pizzaZutatenFabrik.erstelleSosse();
        salami = pizzaZutatenFabrik.erstelleSalami();
        käse = pizzaZutatenFabrik.erstelleKäse();
    }
}
