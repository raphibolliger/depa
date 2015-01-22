package factory.pizza;

import factory.pizza.interfaces.*;

public interface PizzaZutatenFabrik {

    public Teig erstelleTeig();
    public Sosse erstelleSosse();
    public Käse erstelleKäse();
    public Salami erstelleSalami();
    public Gemüse[] erstelleGemüse();
    public Thunfisch erstelleThunfisch();
    public Krabben erstelleKrabben();

}
