package decorator.starbucks.kaffees;

import decorator.starbucks.EGrösse;
import decorator.starbucks.Getränk;

public class Espresso extends Getränk {

    public Espresso(EGrösse grösse) {
        beschreibung = "Espresso";
        this.grösse = grösse;
    }

    @Override
    public double preis() {
        return 1.99;
    }

    @Override
    public EGrösse getGrösse() {
        return grösse;
    }

}
