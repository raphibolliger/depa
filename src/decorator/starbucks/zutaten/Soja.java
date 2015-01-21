package decorator.starbucks.zutaten;

import decorator.starbucks.Getränk;
import decorator.starbucks.ZutatDekorierer;

public class Soja extends ZutatDekorierer {

    public Getränk getränk;

    public Soja(Getränk getränk){
        this.getränk = getränk;
    }

    @Override
    public String getBeschreibung() {
        return this.getränk.getBeschreibung() + ", Soja";
    }

    @Override
    public double preis() {
        return this.getränk.preis() + 0.15;
    }
}
