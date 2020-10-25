import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by Daniel Bojic
 * Date: 2020-10-25
 * Time: 12:13
 * Project: 15 Spel
 * Copyright: MIT
 */
public class Game extends JFrame implements ActionListener {
    JFrame f = new JFrame("15 Spel");
    JPanel p = new JPanel();
    JPanel p2 = new JPanel();

    JButton newGame = new JButton("New Game");
    JLabel youWin = new JLabel();


    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JButton b3 = new JButton();
    JButton b4 = new JButton();

    JButton b5 = new JButton();
    JButton b6 = new JButton();
    JButton b7 = new JButton();
    JButton b8 = new JButton();

    JButton b9 = new JButton();
    JButton b10 = new JButton();
    JButton b11 = new JButton();
    JButton b12 = new JButton();

    JButton b13 = new JButton();
    JButton b14 = new JButton();
    JButton b15 = new JButton();
    JButton b16 = new JButton();


    List<JButton> buttons = Arrays.asList(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16);

    public void mainGame() {



        p.setLayout(new GridLayout(4, 4));
        p2.setLayout(new GridLayout(1, 2));
        f.add(p, BorderLayout.NORTH);
        f.add(p2, BorderLayout.SOUTH);

        p2.add(youWin);
        p2.add(newGame);

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);

        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);

        p.add(b9);
        p.add(b10);
        p.add(b11);
        p.add(b12);

        p.add(b13);
        p.add(b14);
        p.add(b15);
        p.add(b16);




        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);

        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);

        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);

        newGame.addActionListener(this);


        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }







    @Override
    public void actionPerformed(ActionEvent e) {

    }

    //Används för att blanda alla nummer
    public int[] randomNumber() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = r.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }
        return array;
    }



}
