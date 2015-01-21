package decorator.starbucks.kaffees;

import decorator.starbucks.EGrösse;
import decorator.starbucks.Getränk;

public class Hausmischung extends Getränk {

    public Hausmischung(EGrösse grösse) {
        beschreibung = "Hausmischung";
        this.grösse = grösse;
    }

    @Override
    public double preis() {
        return 0.89;
    }

    @Override
    public EGrösse getGrösse() {
        return grösse;
    }

}
