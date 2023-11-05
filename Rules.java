import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start, back;
    Rules(String name){                    //Constructor banaya

        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to Java Quiz");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel instruction = new JLabel();
        instruction.setBounds(20,90,700,350);
        instruction.setFont(new Font("Tahoma",Font.PLAIN,16));
        instruction.setText(
                "<html>"+
                        "1. The student should not use his or her textbook, course notes, or receive help from a proctor or any other outside source." + "<br><br>" +
                        "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer." + "<br><br>" +
                        "3. Students must complete the 10-question multiple-choice Quiz within the 10-minute time frame allotted for the exam." + "<br><br>" +
                        "4. Each question needs to be answered within 1-minute time duration. Otherwise when timer ends, next question will be displayed." + "<br><br>" +
                        " Number of Questions: 10" + "<br><br>" +
                        " Exam Duration: 10 minutes" + "<br><br>" +
                        " All the Best !" + "<br><br>" +
                        "<html>"
        );
        add(instruction);

        setSize(800,650);
        setLocation(350,100);
        setVisible(true);


        back = new  JButton ("Back");             //For Buttons
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);          // For click event jo batata hai kuch toh click hua
        add(back);


        start = new  JButton ("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);



    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == start){

            setVisible(false);
            new Quiz(name);

        }else {
            setVisible(false);
            new Login();
        }

    }

    public static void main(String[] args) {
        new  Rules("User");           //Rules class ka obj bananya hai jisse constructor call hoga
    }
}
