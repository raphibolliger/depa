package kw38.ColorPicker.MyJRadioButtons;

import kw38.ColorPicker.ColorDefinition;
import kw38.ColorPicker.GUI;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;
import java.util.Observer;

public class MyJRadioButtonRed extends JRadioButton implements Observer, MouseListener {

    public MyJRadioButtonRed(String color)
    {
        super(color);
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {

    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        ColorDefinition.colorRed = 255;
        ColorDefinition.colorGreen = 0;
        ColorDefinition.colorBlue = 0;
        GUI.manager.colorChanger();
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

    @Override
    public void update(Observable o, Object arg)
    {
        if (ColorDefinition.colorRed == 255 && ColorDefinition.colorBlue == 0 && ColorDefinition.colorGreen == 0)
        {
            this.setSelected(true);
            System.out.print("true ");
        }
        else
        {
            GUI.radioGroup.clearSelection();
        }
    }
}
