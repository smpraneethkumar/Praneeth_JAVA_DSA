package lambda.MyWindow;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {

    public static void main(String[] args){

//        window : object JFrame
        JFrame frame = new JFrame("My Window");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());



// create button and add iframe
        JButton btn = new JButton("Click Me!");

//        -----------THIS IS WITH OUT LAMBDA -----------
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button is clicked");
//                JOptionPane.showMessageDialog(null,"Hey button is clicked!");
//            }
//        });

//        THIS IS WITH LAMBDA---------------------
        btn.addActionListener((ActionEvent e)->{
            System.out.println("Button is clicked");
                JOptionPane.showMessageDialog(null,"Hey button is clicked!");
        });
        frame.add(btn);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
