package ProgrammingExercises;
// Create a JFrame with the BorderLayout, place a button in the center
// When the user clicks the button, the background colour of one of the other regions will change

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JColorFrame extends JFrame implements ActionListener {
    JPanel up = new JPanel();
    JPanel down = new JPanel();
    JPanel right = new JPanel();
    JPanel left = new JPanel();
    JButton center = new JButton("Push to change background colours");
    Container con = null;
    Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE, Color.PINK, Color.BLACK, Color.YELLOW, Color.WHITE};

    public JColorFrame(){
        con = this.getContentPane();
        con.setLayout(new BorderLayout(5,5));
        con.add(up, BorderLayout.NORTH);
        con.add(down, BorderLayout.SOUTH);
        con.add(left,BorderLayout.WEST);
        con.add(right,BorderLayout.EAST);
        con.add(center,BorderLayout.CENTER);
        center.addActionListener(this);

        setSize(500,500);
        setTitle("Changing Background Colours");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        int randomNum = (int)(Math.random()*colors.length);
        Color backgroundColor = colors[randomNum];
        randomNum = (int)(Math.random()*5);
        if(randomNum == 1){
            up.setBackground(backgroundColor);
        }
        if(randomNum == 2){
            down.setBackground(backgroundColor);
        }
        if(randomNum == 3){
            left.setBackground(backgroundColor);
        }
        if(randomNum == 4){
            right.setBackground(backgroundColor);
        }
    }

    public static void main(String args[]){
        JColorFrame frame = new JColorFrame();
    }
}
