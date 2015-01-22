package factory.pizza.pizzen;

import factory.pizza.Pizza;
import factory.pizza.PizzaZutatenFabrik;

/**
 * Created by raphi on 22.01.15.
 */
public class KrabbenPizza extends Pizza {

    PizzaZutatenFabrik pizzaZutatenFabrik;

    public  KrabbenPizza(PizzaZutatenFabrik pizzaZutatenFabrik){
        this.pizzaZutatenFabrik = pizzaZutatenFabrik;
    }

    @Override
    public void vorbereiten() {
        System.out.println("Mache " + name);
        teig = pizzaZutatenFabrik.erstelleTeig();
        sosse = pizzaZutatenFabrik.erstelleSosse();
        käse = pizzaZutatenFabrik.erstelleKäse();
        krabben = pizzaZutatenFabrik.erstelleKrabben();
    }
}
