package kw38.ColorPicker.MyJTextFieldNums;

import kw38.ColorPicker.ColorDefinition;

import javax.swing.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.util.Observable;
import java.util.Observer;

public class MyJTextFieldNumGreen extends JTextField implements Observer, TextListener {

    public MyJTextFieldNumGreen()
    {
        super();
        //addTextListener(this);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        setText(new Integer(ColorDefinition.colorGreen).toString());
    }

    @Override
    public void textValueChanged(TextEvent e)
    {

    }
}
