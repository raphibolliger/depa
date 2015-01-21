package decorator.starbucks;

import decorator.starbucks.kaffees.DunkleRöstung;
import decorator.starbucks.kaffees.Espresso;
import decorator.starbucks.kaffees.Hausmischung;
import decorator.starbucks.zutaten.Milchschaum;
import decorator.starbucks.zutaten.Schoko;
import decorator.starbucks.zutaten.Soja;

public class StarBucks {

    public static void main(String[] args){

        Getränk getränk = new Espresso(EGrösse.Gross);
        System.out.println(getränk.getBeschreibung() + " " + getränk.preis() + " CHF");

        Getränk getränk1 = new DunkleRöstung(EGrösse.Gross);
        getränk1 = new Schoko(getränk1);
        getränk1 = new Schoko(getränk1);
        getränk1 = new Milchschaum(getränk1);
        System.out.println(getränk1.getBeschreibung() + " " + getränk1.preis() + " CHF");

        Getränk getränk2 = new Hausmischung(EGrösse.Gross);
        getränk2 = new Soja(getränk2);
        getränk2 = new Schoko(getränk2);
        getränk2 = new Milchschaum(getränk2);
        System.out.println(getränk2.getBeschreibung() + " " + getränk2.preis() + " CHF");

    }

}
