package kw38.ColorPicker.MyJTextFieldHexs;

import kw38.ColorPicker.ColorDefinition;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class MyJTextFieldHexBlue extends JTextField implements Observer {

    public MyJTextFieldHexBlue()
    {
        setEnabled(false);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        String hex= Integer.toHexString(ColorDefinition.colorBlue);
        setText(hex.toUpperCase());
    }
}
