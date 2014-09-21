package kw38.ColorPicker.MyJTextFieldNums;

import kw38.ColorPicker.ColorDefinition;
import kw38.ColorPicker.GUI;

import javax.swing.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.util.Observable;
import java.util.Observer;

public class MyJTextFieldNumRed extends JTextField implements Observer, TextListener {

    public MyJTextFieldNumRed()
    {
        //addTextListener(this);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        setText(new Integer(ColorDefinition.colorRed).toString());
    }

    @Override
    public void textValueChanged(TextEvent e)
    {
        int number = new Integer(e.paramString());

        if (number < 0)
            ColorDefinition.colorRed = 0;
        else if (number > 255)
            ColorDefinition.colorRed = 255;
        else
            ColorDefinition.colorRed = new Integer(e.paramString());

        GUI.manager.colorChanger();
    }
}
