package decorator.starbucks.zutaten;

import decorator.starbucks.Getränk;
import decorator.starbucks.ZutatDekorierer;

public class Milchschaum extends ZutatDekorierer {

    public Getränk getränk;

    public Milchschaum(Getränk getränk){
        this.getränk = getränk;
    }

    @Override
    public String getBeschreibung() {
        return this.getränk.getBeschreibung() + ", Milchschaum";
    }

    @Override
    public double preis() {
        return this.getränk.preis() + 0.1;
    }
}
