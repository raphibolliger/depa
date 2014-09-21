package kw38.ColorPicker;

import kw38.ColorPicker.MyJPanelColorFields.MyJPanelColorField;
import kw38.ColorPicker.MyJRadioButtons.MyJRadioButtonRed;
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

public class GUI extends JFrame {

    // Menu Bar
    private JMenuBar menuBar = new JMenuBar();

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
    private MyJRadioButton blueRadio = new MyJRadioButton("blue");
    private MyJRadioButton greenRadio = new MyJRadioButton("green");
    private MyJRadioButton yellowRadio = new MyJRadioButton("yellow");
    private MyJRadioButton cyanRadio = new MyJRadioButton("cyan");
    private MyJRadioButton orangeRadio = new MyJRadioButton("orange");
    private MyJRadioButton blackRadio = new MyJRadioButton("black");
    private MyJRadioButton greyRadio = new MyJRadioButton("grey");

    private MyJButton darkerButton = new MyJButton("Darker", 0);
    private MyJButton brighterButton = new MyJButton("Brighter", 1);

    private MyJPanelColorField colorField = new MyJPanelColorField();

    public static NotificationManager manager;
    public static ButtonGroup radioGroup = new ButtonGroup();


    public GUI()
    {
        setTitle("ColorPicker");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        manager = new NotificationManager();

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

        radioGroup.add(redRadio);
        radioGroup.add(blueRadio);
        radioGroup.add(greenRadio);
        radioGroup.add(yellowRadio);
        radioGroup.add(cyanRadio);
        radioGroup.add(orangeRadio);
        radioGroup.add(blackRadio);
        radioGroup.add(greyRadio);

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
