package decorator.starbucks.kaffees;

import decorator.starbucks.EGrösse;
import decorator.starbucks.Getränk;

public class DunkleRöstung extends Getränk {

    public DunkleRöstung(EGrösse grösse){
        beschreibung = "Dunkle Röstung";
        this.grösse = grösse;
    }

    @Override
    public double preis() {
        return 0.99;
    }

    @Override
    public EGrösse getGrösse() {
        return grösse;
    }
}
