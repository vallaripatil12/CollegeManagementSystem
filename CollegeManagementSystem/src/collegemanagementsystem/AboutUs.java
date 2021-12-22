/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegemanagementsystem;

/**
 *
 * @author Anish
 */
import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame {

    private JPanel panel;

    public static void main(String[] args) {
        new AboutUs().setVisible(true);
    }

    public AboutUs(){
        setTitle("Java Mini Project");
        setSize(600,600);
        setLocation(350,150);
        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("collegemanagementsystem.icons/Logo.png"));
        setIconImage(image.getImage());
        setLayout(null);
        
//        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        setContentPane(panel);
        panel.setLayout(null);
        
        JLabel label0 = new JLabel("College");
        label0.setForeground(new Color(0, 0, 0));
        label0.setFont(new Font("Kumbh Sans", Font.BOLD, 34));
        label0.setBounds(210, 40, 200, 55);
        panel.add(label0);

        JLabel label1 = new JLabel("Management System");
        label1.setForeground(new Color(0, 0, 0));
        label1.setFont(new Font("Kumbh Sans", Font.BOLD , 34));
        label1.setBounds(120, 90, 405, 40);
        panel.add(label1);

        JLabel label2 = new JLabel("Developed By : ");
        label2.setFont(new Font("Kumbh Sans", Font.BOLD, 30));
        label2.setBounds(70, 190, 600, 35);
        panel.add(label2);

        JLabel label3 = new JLabel("44-Meet Mulik");
        label3.setFont(new Font("Kumbh Sans", Font.PLAIN, 25));
        label3.setBounds(70,235,600,35);
        panel.add(label3);

        JLabel label4 = new JLabel("37-Anish Lohiya");
        label4.setFont(new Font("Kumbh Sans", Font.PLAIN, 25));
        label4.setBounds(70,270,600,35);
        panel.add(label4);

        JLabel label5 = new JLabel("38-Riddhi Mehta");
        label5.setFont(new Font("Kumbh Sans", Font.PLAIN, 25));
        label5.setBounds(70,305,600,35);
        panel.add(label5);
        
        JLabel label9 = new JLabel("65-Manali Bhave");
        label9.setFont(new Font("Kumbh Sans", Font.PLAIN, 25));
        label9.setBounds(70,340,600,35);
        panel.add(label9);

        JLabel label6 = new JLabel("Mentors:");
        label6.setFont(new Font("Kumbh Sans", Font.BOLD, 30));
        label6.setBounds(70,380,600,35);
        panel.add(label6);

        JLabel label7 = new JLabel("Mrs.Rohini Sawant");
        label7.setFont(new Font("Kumbh Sans", Font.PLAIN, 25));
        label7.setBounds(70,420,600,35);
        panel.add(label7);

        JLabel label8 = new JLabel("Mrs.Vinita Mishra");
        label8.setFont(new Font("Kumbh Sans", Font.PLAIN, 25));
        label8.setBounds(70,450,600,35);
        panel.add(label8);
        
        JLabel id15=new JLabel();
        id15.setBounds(0,0,1700,800);
        id15.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("collegemanagementsystem.icons/AboutUs.png"));
        Image i3 = img.getImage().getScaledInstance(1700, 800,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        id15.setIcon(icc3);
        add(id15);

        panel.setBackground(Color.WHITE);
    }

}