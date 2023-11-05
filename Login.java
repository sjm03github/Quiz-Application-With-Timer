import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton rules, back;        //Globally declare kiya.. isse pehle localy constructor me define tha
    JTextField tfname;      //Globally declare bcoz dusre frame me dikhna chahiye
    Login(){            // Constructor

       getContentPane().setBackground(Color.WHITE);        //getContentPane() se pure frame ko utha sakte ho &&
                                                            // Color class awt package me hoti hai

        setLayout(null);        //Swing ko bata rhe ke apna layout banaunga aapka nhi use karna

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/login.jpg")); // Component Banaya Image loading

        JLabel image = new JLabel(i1);      //JLabel ka obj banaya image name se
        image.setBounds(0,0,600,500);   //setBounds function se apna layout bana sakte ho left se 0 the top se 0
        add(image);             // bina add function component ko frame pe add nhi kar sakte


        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
     //   heading.setForeground(Color.BLUE);      // for Font Color
        heading.setForeground(new Color(30,144,254));       // For RGB Font can use obj
        add(heading);


        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(new Color(30,144,254));       // For RGB Font can use obj
        add(name);


        tfname = new JTextField();                       //For textField
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);


        rules = new  JButton ("Instructions");             //For Buttons
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);          // For click event jo batata hai kuch toh click hua
        add(rules);


        back = new  JButton ("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        setSize(1200,500);
        setLocation(200,150);       //Frame ka origin bydefaultleft me hota hai so adjusting 200 left se and 150 top se
        setVisible(true);                    //Frame Bydefault hidden so make it true

    }

    public void actionPerformed (ActionEvent ae){       //Agar apni class me kisi bhi interface(here Actionlistener) ko implement karte ho toh
                    //interface ke andar jitne bhi unimplemented(abstract) menthods hai unko override karna padta hai

        if(ae.getSource() == rules){

            String name = tfname.getText();         //user enter text lene ke liye
            setVisible(false);           //current frame close
            new Rules(name);                // Nayi class ka obj banao agar nayi class kholna hai click pe

        } else if (ae.getSource() == back) {
            setVisible(false);      //back pe click pe frame close hona chahiye
        }
    }

    public static void main(String[] args) {

        new Login();        //Class ka obj banaya hai
    }

}
