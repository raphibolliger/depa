package decorator.starbucks.zutaten;

import decorator.starbucks.Getränk;
import decorator.starbucks.ZutatDekorierer;

public class Schoko extends ZutatDekorierer {

    public Getränk getränk;

    public Schoko(Getränk getränk){
        this.getränk = getränk;
    }

    @Override
    public String getBeschreibung() {
        return getränk.getBeschreibung() + ", Schoko";
    }

    @Override
    public double preis() {
        return this.getränk.preis() + 0.2;
    }
}
