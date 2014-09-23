package kw38.ColorPicker.MyJRadioButtonMenuItems;

import kw38.ColorPicker.ColorDefinition;
import kw38.ColorPicker.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class MyJRadioButtonMenuItemGreen extends JRadioButtonMenuItem implements Observer, ActionListener {

    public MyJRadioButtonMenuItemGreen(String text)
    {
        super(text);
        addActionListener(this);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        if (ColorDefinition.colorRed == 0 && ColorDefinition.colorBlue == 0 && ColorDefinition.colorGreen == 255)
            this.setSelected(true);
        else
            this.setSelected(false);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        ColorDefinition.colorRed = 0;
        ColorDefinition.colorGreen = 255;
        ColorDefinition.colorBlue = 0;
        GUI.manager.colorChanger();
    }
}
