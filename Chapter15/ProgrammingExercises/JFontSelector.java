package ProgrammingExercises;
// JFrame has five buttons with the names of five different fonts
// Sixth button makes the font size larger or smaller
// JLabel changes in font and size according to what the user selects
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFontSelector extends JFrame implements ActionListener{
    final int SMALL = 14;
    final int LARGE = 26;
    int fontSize = SMALL;
    boolean isSmaller = true;
    JButton button1 = new JButton("Arial");
    JButton button2 = new JButton("Helvetica");
    JButton button3 = new JButton("Algerian");
    JButton button4 = new JButton("Sans Serif");
    JButton button5 = new JButton("Dialog Input");
    JButton buttonSize = new JButton("Increase/Decrease Font Size");
    JLabel label1 = new JLabel("Hello World");

    Font font1 = new Font("Arial",Font.PLAIN, fontSize);
    Font font2 = new Font("Helvetica", Font.PLAIN, fontSize);
    Font font3 = new Font("Algerian", Font.PLAIN, fontSize);
    Font font4 = new Font("SansSerif" ,Font.PLAIN, fontSize);
    Font font5 = new Font("DialogInput", Font.PLAIN, fontSize);
    Font labelFont = font1;


    public JFontSelector(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(buttonSize);
        add(label1);

        /*
        button1.setFont(font1);
        button2.setFont(font2);
        button3.setFont(font3);
        button4.setFont(font4);
        button5.setFont(font5);*/
        label1.setFont(font1);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        buttonSize.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == button1){
            labelFont = font1;
        }
        if(source == button2){
            labelFont = font2;
        }
        if(source == button3){
            labelFont = font3;
        }
        if(source == button4){
            labelFont = font4;
        }
        if(source == button5){
            labelFont = font5;
        }
        if(source == buttonSize){
            if(isSmaller){
                fontSize = SMALL;
                labelFont = labelFont.deriveFont(Font.PLAIN,fontSize);
            }else{
                fontSize = LARGE;
                labelFont = labelFont.deriveFont(Font.PLAIN,fontSize);
            }
            isSmaller = !isSmaller;
        }
        label1.setFont(labelFont);
    }
    public static void main(String args[]){
        JFontSelector frame = new JFontSelector();

    }
}
