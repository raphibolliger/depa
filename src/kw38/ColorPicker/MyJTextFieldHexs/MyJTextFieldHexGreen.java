package kw38.ColorPicker.MyJTextFieldHexs;

import kw38.ColorPicker.ColorDefinition;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class MyJTextFieldHexGreen extends JTextField implements Observer {

    public MyJTextFieldHexGreen()
    {
        setEnabled(false);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        String hex= Integer.toHexString(ColorDefinition.colorGreen);
        setText(hex.toUpperCase());
    }
}
