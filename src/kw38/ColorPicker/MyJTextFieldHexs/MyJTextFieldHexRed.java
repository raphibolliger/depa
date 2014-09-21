package kw38.ColorPicker.MyJTextFieldHexs;

import kw38.ColorPicker.ColorDefinition;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class MyJTextFieldHexRed extends JTextField implements Observer {

    public MyJTextFieldHexRed()
    {
        this.setEnabled(false);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        String hex= Integer.toHexString(ColorDefinition.colorRed);
        setText(hex.toUpperCase());
    }
}
