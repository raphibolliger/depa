package kw38.ColorPicker;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class MyJRadioButton extends JRadioButton implements Observer {

    public MyJRadioButton(String name)
    {
        super(name);
    }

    @Override
    public void update(Observable o, Object arg)
    {

    }

}
