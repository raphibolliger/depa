package kw38.ColorPicker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class MyJButton extends JButton implements Observer, ActionListener {

    private int type; // 0->Darker, 1->Brighter

    public MyJButton(String name, int type)
    {
        super(name);
        this.type = type;
        this.addActionListener(this);
    }

    @Override
    public void update(Observable o, Object arg)
    {

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("test");
    }
}
