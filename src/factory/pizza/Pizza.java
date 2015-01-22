package factory.pizza;

import factory.pizza.interfaces.*;

public abstract class Pizza {

    public String name;
    public Teig teig;
    public Sosse sosse;
    public Salami salami;
    public Gemüse[] gemüse;
    public Käse käse;
    public Thunfisch thunfisch;
    public Krabben krabben;

    public abstract void vorbereiten();

    public void backen(){
        System.out.println("Backe 25 Minuten bei 350 Grad");
    }

    public void schneiden(){
        System.out.println("Schneide die Pizza diagnonal in Stücke");
    }

    public void einpacken(){
        System.out.println("Packe die Pizza in die Schachtel");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        // Hier kommt der Code zum Ausgeben der Pizzas rein.
        return "Pizza";
    }

}
