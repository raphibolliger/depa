package kw38.ColorPicker.MyJRadioButtonMenuItems;

import kw38.ColorPicker.ColorDefinition;
import kw38.ColorPicker.GUI;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;
import java.util.Observer;

public class MyJRadioButtonMenuItemRed extends JRadioButtonMenuItem implements Observer, MouseListener {

    public MyJRadioButtonMenuItemRed(String text)
    {
        super(text);
        addMouseListener(this);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        ColorDefinition.colorRed = 255;
        ColorDefinition.colorGreen = 0;
        ColorDefinition.colorBlue = 0;
        GUI.manager.colorChanger();
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        if (ColorDefinition.colorRed == 255 && ColorDefinition.colorBlue == 0 && ColorDefinition.colorGreen == 0)
            this.setSelected(true);
        else
            this.setSelected(false);
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
