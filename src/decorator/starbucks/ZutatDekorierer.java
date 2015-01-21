package decorator.starbucks;

public abstract class ZutatDekorierer extends Getränk {

    public abstract String getBeschreibung();

    public EGrösse getGrösse(){
        return grösse;
    }

}
