package ProgrammingExercises;
// Place a button in each region of a BorderLayout JFrame
// Each button displays the title of a Movie
// When user clicks on the button, the year of release and one of the stars of the movie is displayed

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JMovieFrame extends JFrame implements ActionListener{
    JButton northButton = new JButton("North by Northwest");
    JButton southButton = new JButton("Southpaw");
    JButton eastButton = new JButton("East of Eden");
    JButton westButton = new JButton("Westworld");
    JButton centerButton = new JButton("Journey to the Center of the Earth");
    Container con = null;


    public JMovieFrame(){
        con = this.getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con.setLayout(new BorderLayout());
        con.add(northButton,BorderLayout.NORTH);
        con.add(southButton,BorderLayout.SOUTH);
        con.add(eastButton,BorderLayout.EAST);
        con.add(westButton,BorderLayout.WEST);
        con.add(centerButton,BorderLayout.CENTER);

        northButton.addActionListener(this);
        southButton.addActionListener(this);
        westButton.addActionListener(this);
        eastButton.addActionListener(this);
        centerButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        String movieStar = " ";
        int releaseYear;
        if(source == northButton){
            movieStar = "Cary Grant";
            releaseYear = 1959;
            northButton.setText("North by Northwest\t Starring: "+movieStar+"\tReleased in: "+Integer.toString(releaseYear));
        }
        if(source == southButton){
            movieStar = "Jake Gyllenhaal";
            releaseYear = 2015;
            southButton.setText("Southpaw\t Starring: "+movieStar+"\tReleased in: "+Integer.toString(releaseYear));
        }
        if(source == eastButton){
            movieStar = "James Dean";
            releaseYear = 1955;
            eastButton.setText("East of Eden\t Starring: "+movieStar+"\tReleased in: "+Integer.toString(releaseYear));
        }
        if(source == westButton){
            movieStar = "Yul Brynner";
            releaseYear = 1973;
            westButton.setText("Westworld\t Starring: "+movieStar+"\tReleased in: "+Integer.toString(releaseYear));
        }
        if(source == centerButton){
            movieStar = "James Mason";
            releaseYear = 1959;
            centerButton.setText("Journey to the Center of the Earth\t Starring: "+movieStar+"\tReleased in: "+Integer.toString(releaseYear));
        }
    }

    public static void main(String args[]){
        JMovieFrame frame = new JMovieFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
