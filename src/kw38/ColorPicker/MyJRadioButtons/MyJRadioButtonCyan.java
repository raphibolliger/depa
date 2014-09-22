package kw38.ColorPicker.MyJRadioButtons;

import kw38.ColorPicker.ColorDefinition;
import kw38.ColorPicker.GUI;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;
import java.util.Observer;

public class MyJRadioButtonCyan extends JRadioButton implements Observer, MouseListener {

    public MyJRadioButtonCyan(String text)
    {
        super(text);
        addMouseListener(this);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        if (ColorDefinition.colorRed == 255 && ColorDefinition.colorBlue == 255 && ColorDefinition.colorGreen == 0)
            this.setSelected(true);
        else
            this.setSelected(false);
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        ColorDefinition.colorRed = 255;
        ColorDefinition.colorGreen = 0;
        ColorDefinition.colorBlue = 255;
        GUI.manager.colorChanger();
    }

    @Override
    public void mousePressed(MouseEvent e)
    {

    }

    @Override
    public void mouseReleased(MouseEvent e)
    {

    }

    @Override
    public void mouseEntered(MouseEvent e)
    {

    }

    @Override
    public void mouseExited(MouseEvent e)
    {

    }
}