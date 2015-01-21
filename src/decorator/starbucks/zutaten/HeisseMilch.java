package decorator.starbucks.zutaten;

import decorator.starbucks.Getränk;
import decorator.starbucks.ZutatDekorierer;

public class HeisseMilch extends ZutatDekorierer {

    public Getränk getränk;

    public HeisseMilch(Getränk getränk){
        this.getränk = getränk;
    }

    @Override
    public String getBeschreibung() {
        return this.getränk.getBeschreibung() + ", Heisse Milch";
    }

    @Override
    public double preis() {
        return this.getränk.preis() + 0.1;
    }
}
