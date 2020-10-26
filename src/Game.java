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

    //Lista med alla knappar
    List<JButton> buttons = Arrays.asList(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16);

    public void mainGame() {


        //Layout
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



        //ANVÄND FÖR PRESENTATION
        //Startar spelet med alla knappar i ordning
        presentation(buttons);

        //Startar spelet i random ordning
        //random(buttons);


        //Actionlisteners för alla knappar
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
        if (e.getSource() == b1) {
            List<JButton> tempList = Arrays.asList(b2, b5, b6);
            findEmptyFromList(b1, tempList);
        } else if (e.getSource() == b2) {
            List<JButton> tempList = Arrays.asList(b1, b3, b5, b6, b7);
            findEmptyFromList(b2, tempList);
        } else if (e.getSource() == b3) {
            List<JButton> tempList = Arrays.asList(b2, b4, b6, b7, b8);
            findEmptyFromList(b3, tempList);
        } else if (e.getSource() == b4) {
            List<JButton> tempList = Arrays.asList(b3, b7, b8);
            findEmptyFromList(b4, tempList);
        } else if (e.getSource() == b5) {
            List<JButton> tempList = Arrays.asList(b1, b2, b6, b9, b10);
            findEmptyFromList(b5, tempList);
        } else if (e.getSource() == b6) {
            List<JButton> tempList = Arrays.asList(b1, b2, b3, b5, b7, b9, b10, b11);
            findEmptyFromList(b6, tempList);
        } else if (e.getSource() == b7) {
            List<JButton> tempList = Arrays.asList(b2, b3, b4, b6, b8, b10, b11, b12);
            findEmptyFromList(b7, tempList);
        } else if (e.getSource() == b8) {
            List<JButton> tempList = Arrays.asList(b3, b4, b7, b11, b12);
            findEmptyFromList(b8, tempList);
        } else if (e.getSource() == b9) {
            List<JButton> tempList = Arrays.asList(b5, b6, b10, b13, b14);
            findEmptyFromList(b9, tempList);
        } else if (e.getSource() == b10) {
            List<JButton> tempList = Arrays.asList(b5, b6, b7, b9, b11, b13, b14, b15);
            findEmptyFromList(b10, tempList);
        } else if (e.getSource() == b11) {
            List<JButton> tempList = Arrays.asList(b6, b7, b8, b10, b12, b14, b15, b16);
            findEmptyFromList(b11, tempList);
        } else if (e.getSource() == b12) {
            List<JButton> tempList = Arrays.asList(b7, b8, b11, b15, b16);
            findEmptyFromList(b12, tempList);
        } else if (e.getSource() == b13) {
            List<JButton> tempList = Arrays.asList(b9, b10, b14);
            findEmptyFromList(b13, tempList);
        } else if (e.getSource() == b14) {
            List<JButton> tempList = Arrays.asList(b9, b10, b11, b13, b15);
            findEmptyFromList(b14, tempList);
        } else if (e.getSource() == b15) {
            List<JButton> tempList = Arrays.asList(b10, b11, b12, b14, b16);
            findEmptyFromList(b15, tempList);
        } else if (e.getSource() == b16) {
            List<JButton> tempList = Arrays.asList(b11, b12, b15);
            findEmptyFromList(b16, tempList);
        } else if (e.getSource() == newGame) {
            random(buttons);
        }
    }

    //Hittar vilken knapp från en lista som innehåller 0 och gömmer den
    public void findEmptyFromList(JButton button, List<JButton> findButton) {
        JButton temp = null;
        boolean didYouFind = false;
        for (JButton b : findButton) {
            if (b.getText().equals("0")) {
                temp = b;
                didYouFind = true;
            }
        }
        if (didYouFind == true) {
            changeValue(button, temp);
        }
    }

    //Skapar nytt spel med ordning för presentation
    public void presentation(List<JButton> tempbutton){
        int i = 1;
        for (JButton b : tempbutton){
            if (i == 16){
                i=0;
                b.setVisible(false);
            }else {
                b.setVisible(true);
            }
            b.setText(String.valueOf(i));
            i++;
        }
    }


    //Skapar ett nytt spel med random ordning
    public void random(List<JButton> tempButton) {
        int[] array = randomNumber();

        int i = 0;
        for (JButton b : tempButton) {
            b.setText(String.valueOf(array[i]));
            if (b.getText().equals("0")){
                b.setVisible(false);
            }else {
                b.setVisible(true);
            }
            i++;
        }
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

    //Byter värden på två knappar så de kan flytta på sig
    public void changeValue(JButton button1, JButton button2) {
        button2.setText(button1.getText());
        button1.setText("0");
        button2.setVisible(true);
        button1.setVisible(false);
        win();
    }

    //Om allt är i ordning får man ett meddelande att man har vunnit
    public void win() {
        if (b1.getText().equals("1") && b2.getText().equals("2") && b3.getText().equals("3") && b4.getText().equals("4") &&
                b5.getText().equals("5") && b6.getText().equals("6") && b7.getText().equals("7") && b8.getText().equals("8") &&
                b9.getText().equals("9") && b10.getText().equals("10") && b11.getText().equals("11") && b12.getText().equals("12") &&
                b13.getText().equals("13") && b14.getText().equals("14") && b15.getText().equals("15")) {
            youWin.setText("Grattis, du vann!");
        } else {
            youWin.setText("");
        }
    }

}
