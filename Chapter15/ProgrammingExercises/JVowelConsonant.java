package ProgrammingExercises;
// Randomly select 8 out of 26 buttons that display letters of the alphabet
// When the user clicks on the button, a Jlabel text identifies if it is a vowel or consonant
// A new randomly selected letter replaces the button
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import java.util.Random;

public class JVowelConsonant extends JFrame implements ActionListener {
    Container con = null;
    JButton[] button = new JButton[8];
    String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    int randomNum;
    int index;
    int[] randomButtons = {0,0,0,0,0,0,0,0};

    JPanel panel1 = new JPanel(new FlowLayout());
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JLabel label1 = new JLabel();


    public JVowelConsonant(){
        // Randomly choose 8 numbers from the range 0-25
        for(index = 0; index < 8; index++){
            randomNum = (int)(Math.random()*letters.length);
            randomButtons[index] = randomNum;
        }
        // Create the buttons that correspond to the random numbers chosen
        for(index = 0; index < 8; index++){
            button[index] = new JButton(letters[index]);
            button[index].addActionListener(this);
        }
        // Split the buttons up into 4 in panel 1 and 4 in panel 2
        for(index = 0; index < 8; index++){
            panel1.add(button[index]);
        }
        for(index = 4; index < 8; index++){
            panel2.add(button[index]);
        }
        panel3.add(label1);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,2));
        setVisible(true);
        setSize(350,350);
        add(panel1);
        add(panel2);
        add(panel3);
        panel1.setLayout(new GridLayout(2,2));
        panel2.setLayout(new GridLayout(2,2));
        setTitle("Vowel or Consonant");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        for(int index = 0; index < 8; index++){
            if (source == button[index]) {
                if (button[index].getText() == "A" || button[index].getText() == "E" ||
                        button[index].getText() == "I" || button[index].getText() == "O" || button[index].getText() == "U") {
                    label1.setText(button[index].getText() + " is a vowel.");
                } else {
                    label1.setText(button[index].getText() + " is a consonant");
                }
                randomNum = (int) (Math.random() * letters.length);
                button[index].setText(letters[randomNum]);
                index = 8;
            }
        }

    }

    public static void main(String args[]){
        JVowelConsonant frame = new JVowelConsonant();
    }
}
