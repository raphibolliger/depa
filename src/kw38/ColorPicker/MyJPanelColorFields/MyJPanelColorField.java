package kw38.ColorPicker.MyJPanelColorFields;

import kw38.ColorPicker.ColorDefinition;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class MyJPanelColorField extends JPanel implements Observer {

    @Override
    public void update(Observable o, Object arg)
    {
        setBackground(new Color(ColorDefinition.colorRed, ColorDefinition.colorGreen, ColorDefinition.colorBlue));
    }
}
