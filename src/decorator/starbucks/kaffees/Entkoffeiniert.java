package decorator.starbucks.kaffees;

import decorator.starbucks.EGrösse;
import decorator.starbucks.Getränk;

public class Entkoffeiniert extends Getränk {

    public Entkoffeiniert(EGrösse grösse){
        beschreibung = "Entkoffeiniert";
        this.grösse = grösse;
    }

    @Override
    public double preis() {
        return 1.05;
    }

    @Override
    public EGrösse getGrösse() {
        return grösse;
    }
}
