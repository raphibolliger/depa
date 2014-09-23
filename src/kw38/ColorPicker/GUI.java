package kw38.ColorPicker;

import kw38.ColorPicker.MyJPanelColorFields.MyJPanelColorField;
import kw38.ColorPicker.MyJRadioButtonMenuItems.MyJRadioButtonMenuItemBlue;
import kw38.ColorPicker.MyJRadioButtonMenuItems.MyJRadioButtonMenuItemGreen;
import kw38.ColorPicker.MyJRadioButtonMenuItems.MyJRadioButtonMenuItemRed;
import kw38.ColorPicker.MyJRadioButtons.*;
import kw38.ColorPicker.MyJScrollbars.MyJScrollBarBlue;
import kw38.ColorPicker.MyJScrollbars.MyJScrollBarGreen;
import kw38.ColorPicker.MyJScrollbars.MyJScrollBarRed;
import kw38.ColorPicker.MyJTextFieldHexs.MyJTextFieldHexBlue;
import kw38.ColorPicker.MyJTextFieldHexs.MyJTextFieldHexGreen;
import kw38.ColorPicker.MyJTextFieldHexs.MyJTextFieldHexRed;
import kw38.ColorPicker.MyJTextFieldNums.MyJTextFieldNumBlue;
import kw38.ColorPicker.MyJTextFieldNums.MyJTextFieldNumGreen;
import kw38.ColorPicker.MyJTextFieldNums.MyJTextFieldNumRed;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    // Menu Bar
    private JMenuBar menuBar = new JMenuBar();

    // Menu Bar Items
    private JMenu fileMenu = new JMenu("File");
    private JMenu attributesMenu = new JMenu("Attributes");

    // FileMenu Items
    private JMenuItem exitItem = new JMenuItem("Exit");

    // Panels
    private JPanel topPanel = new JPanel();
    private JPanel topContent = new JPanel();
    private JPanel middleContent = new JPanel();

    private MyJScrollBarRed redScroll = new MyJScrollBarRed();
    private MyJScrollBarGreen greenScroll = new MyJScrollBarGreen();
    private MyJScrollBarBlue blueScroll = new MyJScrollBarBlue();

    private MyJTextFieldNumRed redText = new MyJTextFieldNumRed();
    private MyJTextFieldNumGreen greenText = new MyJTextFieldNumGreen();
    private MyJTextFieldNumBlue blueText = new MyJTextFieldNumBlue();

    private MyJTextFieldHexRed redHexText = new MyJTextFieldHexRed();
    private MyJTextFieldHexGreen greenHexText = new MyJTextFieldHexGreen();
    private MyJTextFieldHexBlue blueHexText = new MyJTextFieldHexBlue();

    private MyJRadioButtonRed redRadio = new MyJRadioButtonRed("red");
    private MyJRadioButtonBlue blueRadio = new MyJRadioButtonBlue("blue");
    private MyJRadioButtonGreen greenRadio = new MyJRadioButtonGreen("green");
    private MyJRadioButtonYellow yellowRadio = new MyJRadioButtonYellow("yellow");
    private MyJRadioButtonCyan cyanRadio = new MyJRadioButtonCyan("cyan");
    private MyJRadioButtonOrange orangeRadio = new MyJRadioButtonOrange("orange");
    private MyJRadioButtonBlack blackRadio = new MyJRadioButtonBlack("black");
    private MyJRadioButtonGray greyRadio = new MyJRadioButtonGray("grey");

    private MyJRadioButtonMenuItemRed menuRadioRed = new MyJRadioButtonMenuItemRed("red");
    private MyJRadioButtonMenuItemGreen menuRadioGreen = new MyJRadioButtonMenuItemGreen("green");
    private MyJRadioButtonMenuItemBlue menuRadioBlue = new MyJRadioButtonMenuItemBlue("blue");

    private MyJButton darkerButton = new MyJButton("Darker", 0);
    private MyJButton brighterButton = new MyJButton("Brighter", 1);

    private MyJPanelColorField colorField = new MyJPanelColorField();

    public static NotificationManager manager;


    public GUI()
    {
        setTitle("ColorPicker");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        manager = new NotificationManager();

        // JMenubar File
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        attributesMenu.add(menuRadioRed);
        attributesMenu.add(menuRadioGreen);
        attributesMenu.add(menuRadioBlue);
        menuBar.add(attributesMenu);

        this.setJMenuBar(menuBar);

        this.setLayout(new BorderLayout());

        topPanel.setLayout(new BorderLayout());

        // Create and Style top Content Panel
        topContent.setLayout(new GridLayout(3,3));
        topContent.add(redScroll);
        topContent.add(redText);
        topContent.add(redHexText);
        topContent.add(greenScroll);
        topContent.add(greenText);
        topContent.add(greenHexText);
        topContent.add(blueScroll);
        topContent.add(blueText);
        topContent.add(blueHexText);
        topPanel.add(topContent, BorderLayout.NORTH);

        middleContent.setLayout(new GridLayout(1,3));
        middleContent.add(colorField);

        JPanel radioButtonsPanel = new JPanel();
        radioButtonsPanel.setLayout(new GridLayout(8,1));

        radioButtonsPanel.add(redRadio);
        radioButtonsPanel.add(blueRadio);
        radioButtonsPanel.add(greenRadio);
        radioButtonsPanel.add(yellowRadio);
        radioButtonsPanel.add(cyanRadio);
        radioButtonsPanel.add(orangeRadio);
        radioButtonsPanel.add(blackRadio);
        radioButtonsPanel.add(greyRadio);
        middleContent.add(radioButtonsPanel);

        JPanel darkBrightButtPan = new JPanel();
        darkBrightButtPan.setLayout(new GridLayout(8,1));
        darkBrightButtPan.add(new JPanel());
        darkBrightButtPan.add(new JPanel());
        darkBrightButtPan.add(new JPanel());
        darkBrightButtPan.add(darkerButton);
        darkBrightButtPan.add(brighterButton);
        darkBrightButtPan.add(new JPanel());
        darkBrightButtPan.add(new JPanel());
        darkBrightButtPan.add(new JPanel());
        middleContent.add(darkBrightButtPan);

        topPanel.add(middleContent, BorderLayout.CENTER);

        this.add(menuBar, BorderLayout.NORTH);
        this.add(topPanel, BorderLayout.CENTER);


        manager.addObserver(redScroll);
        manager.addObserver(greenScroll);
        manager.addObserver(blueScroll);

        manager.addObserver(redText);
        manager.addObserver(redHexText);
        manager.addObserver(blueText);
        manager.addObserver(blueHexText);
        manager.addObserver(greenText);
        manager.addObserver(greenHexText);

        manager.addObserver(colorField);

        manager.addObserver(redRadio);
        manager.addObserver(blueRadio);
        manager.addObserver(greenRadio);
        manager.addObserver(yellowRadio);
        manager.addObserver(cyanRadio);
        manager.addObserver(orangeRadio);
        manager.addObserver(blackRadio);
        manager.addObserver(greyRadio);


        pack();
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new GUI();
    }


}
