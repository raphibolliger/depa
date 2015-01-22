package factory.pizza.zutatenFabriken;

import factory.pizza.PizzaZutatenFabrik;
import factory.pizza.interfaces.*;
import factory.pizza.zutaten.gemüse.Knoblauch;
import factory.pizza.zutaten.gemüse.Paprika;
import factory.pizza.zutaten.gemüse.Pilze;
import factory.pizza.zutaten.gemüse.Zwiebeln;
import factory.pizza.zutaten.krabben.FrischeKrabben;
import factory.pizza.zutaten.käse.Parmesan;
import factory.pizza.zutaten.salami.SpanischeSalami;
import factory.pizza.zutaten.sosse.MarinaraSosse;
import factory.pizza.zutaten.teig.TeigMitDünnerKruste;
import factory.pizza.zutaten.thunfisch.ThunfischStücke;

public class BerlinerPizzaZutatenFabrik implements PizzaZutatenFabrik {

    @Override
    public Teig erstelleTeig() {
        return new TeigMitDünnerKruste();
    }

    @Override
    public Sosse erstelleSosse() {
        return new MarinaraSosse();
    }

    @Override
    public Käse erstelleKäse() {
        return new Parmesan();
    }

    @Override
    public Salami erstelleSalami() {
        return new SpanischeSalami();
    }

    @Override
    public Gemüse[] erstelleGemüse() {
        Gemüse[] gemüse = { new Knoblauch(), new Zwiebeln(), new Pilze(), new Paprika() };
        return gemüse;
    }

    @Override
    public Thunfisch erstelleThunfisch() {
        return new ThunfischStücke();
    }

    @Override
    public Krabben erstelleKrabben() {
        return new FrischeKrabben();
    }

}
