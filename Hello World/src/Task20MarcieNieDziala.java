import javax.swing.*;

public class Task20MarcieNieDziala {
    public static void main(String args[]){

        String ageString = JOptionPane.showInputDialog("Enter your age so I'd be able to tell what age will you be next year");

        int age = Integer.parseInt(ageString);
        int year = 2014;

        while (year<2019) {
            
            age++;
            year++;
            JOptionPane.showMessageDialog(null, String.format("In year %d you will be %d", year, age));
        }

    }
} 