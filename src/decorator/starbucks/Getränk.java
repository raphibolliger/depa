package decorator.starbucks;

public abstract class Getränk {

    public String beschreibung = "Unbekanntes Getränk";
    public EGrösse grösse = EGrösse.Mittel;

    public String getBeschreibung() {
        return beschreibung;
    }

    public abstract double preis();

    public abstract EGrösse getGrösse();

}