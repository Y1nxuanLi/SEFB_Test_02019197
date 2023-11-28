import Package1.SubClass1;
import Package1.SubClass2;
import Package2.SubClass3;
import Package2.SubClass4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

    public static void main(String[] args) {
        System.out.println();

        SubClass1 sub1 = new SubClass1();
        SubClass2 sub2 = new SubClass2();
        SubClass3 sub3 = new SubClass3();
        SubClass4 sub4 = new SubClass4();
        String x = sub1.constructSubClass1Parameter4();
        System.out.println(x);
        String y = sub1.setSubClass1Parameter5("Test");
        System.out.println(y);

        sub1.Display();
        sub2.Display();
        sub3.interfaceDisplay();
        sub4.interfaceDisplay();

        sub1.interfaceDisplay();
        sub2.interfaceDisplay();

        User user1 = new User("Bob");
        user1.changeArray();
        User user2 = new User("Jack");
        user2.changeInfo("NEW NEW NEW NEW NEW");

        // Create a simple window to display the output

        JFrame f=new JFrame("Title");

        JPanel displayPanel = new JPanel();
        // Create a label for each patient's text
        JLabel displayLabel1 = new JLabel("<html>"+user1.displayAllMethod()+"<html><ul><li>Item 1</li><li>Item 2</li></ul></html>"+"<br></html>");
        JLabel displayLabel2 = new JLabel("<html>"+user2.displayAllMethod()+"<br></html>");

        displayPanel.add(displayLabel1);
        displayPanel.add(displayLabel2);

        f.setSize(600, 400);
        f.setLayout(new GridLayout(1, 2));

        f.add(displayLabel1);
        f.add(displayLabel2);

        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }


}
