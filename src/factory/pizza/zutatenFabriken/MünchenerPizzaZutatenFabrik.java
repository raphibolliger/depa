package factory.pizza.zutatenFabriken;

import factory.pizza.PizzaZutatenFabrik;
import factory.pizza.interfaces.*;
import factory.pizza.zutaten.gemüse.Aubergine;
import factory.pizza.zutaten.gemüse.SchwarzeOliven;
import factory.pizza.zutaten.gemüse.Spinat;
import factory.pizza.zutaten.krabben.GefroreneKrabben;
import factory.pizza.zutaten.käse.Mozzarella;
import factory.pizza.zutaten.sosse.Tomatensosse;
import factory.pizza.zutaten.teig.TeigMitDickerKruste;
import factory.pizza.zutaten.thunfisch.ThunfischStücke;

public class MünchenerPizzaZutatenFabrik implements PizzaZutatenFabrik {

    @Override
    public Teig erstelleTeig() {
        return new TeigMitDickerKruste();
    }

    @Override
    public Sosse erstelleSosse() {
        return new Tomatensosse();
    }

    @Override
    public Käse erstelleKäse() {
        return new Mozzarella();
    }

    @Override
    public Salami erstelleSalami() {
        return null;
    }

    @Override
    public Gemüse[] erstelleGemüse() {
        Gemüse[] gemüse = { new SchwarzeOliven(), new Spinat(), new Aubergine() };
        return gemüse;
    }

    @Override
    public Thunfisch erstelleThunfisch() {
        return new ThunfischStücke();
    }

    @Override
    public Krabben erstelleKrabben() {
        return new GefroreneKrabben();
    }
}
