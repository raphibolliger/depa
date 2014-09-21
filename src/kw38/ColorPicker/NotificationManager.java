package kw38.ColorPicker;

import java.util.Observable;

public class NotificationManager extends Observable {

    public void colorChanger()
    {
        if (countObservers()>0)
        {
            setChanged();
            notifyObservers();
        }
    }

}
