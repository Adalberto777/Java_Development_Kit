package seminar_01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingWindow extends JFrame {
    private static final int WIDTH = 230;
    private static final int HEIGHT = 350;

    JRadioButton human;
    JRadioButton ai;
    ButtonGroup buttonGroup;

    public JLabel choiceHA;

    JButton btnStart;

    JPanel panMain;
    JLabel fieldSize;
    JLabel currentFieldSize;
    JSlider sliderFieldSize;
    JLabel winSize;
    JLabel currentWinSize;
    JSlider sliderWinSize;


    SettingWindow(GameWindow gameWindow){
        human = new JRadioButton("HUMAN VS HUMAN");
        ai = new JRadioButton("HUMAN VS AI");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(human);
        buttonGroup.add(ai);
        btnStart = new JButton("Start new game");
        panMain = new JPanel(new GridLayout(9, 1));
        fieldSize = new JLabel("Choice the size of panel");
        choiceHA = new JLabel("Choice player");
        currentFieldSize = new JLabel("Current field size");
        panMain.add(choiceHA);
        sliderFieldSize = new JSlider(3, 10, 3);
        currentWinSize = new JLabel("Set length");
        winSize = new JLabel("Choice length for win");
        sliderFieldSize = new JSlider(3,10,3);

        setLocationRelativeTo(gameWindow);
        setSize(WIDTH, HEIGHT);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                gameWindow.startNewGame(0, 3, 3, 3);
            }
        });
        panMain.add(human);
        panMain.add(ai);
        panMain.add(fieldSize);
        panMain.add(currentFieldSize);
        panMain.add(sliderFieldSize);
        panMain.add(currentWinSize);
        panMain.add(winSize);
        panMain.add(sliderFieldSize);
        add(panMain);
        add(btnStart, BorderLayout.SOUTH);
    }
}
