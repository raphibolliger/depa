package kw38.ColorPicker.MyJScrollbars;

import kw38.ColorPicker.ColorDefinition;
import kw38.ColorPicker.GUI;

import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.Observable;
import java.util.Observer;

public class MyJScrollBarBlue extends JScrollBar implements Observer, AdjustmentListener {

    public MyJScrollBarBlue()
    {
        super(HORIZONTAL,0,0,0,255);
        addAdjustmentListener(this);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e)
    {
        ColorDefinition.colorBlue = e.getValue();
        GUI.manager.colorChanger();
    }

    @Override
    public void update(Observable o, Object arg)
    {
        setValue(ColorDefinition.colorBlue);
    }
}
