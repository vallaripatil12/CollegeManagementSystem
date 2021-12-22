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
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener{
    Project(){
        super("College Management System");
        
        setSize(1920,1030);
        
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("collegemanagementsystem.icons/Project12.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1900, 780,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        
        add(l1);
        
        JMenuBar mb  = new JMenuBar();
        JMenu master = new JMenu("Master");
        JMenuItem m1 = new JMenuItem("New Faculty");
        JMenuItem m2 = new JMenuItem("New Student Admission");
        master.setForeground(Color.BLACK);
                
        m1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("collegemanagementsystem.icons/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        m1.setIcon(new ImageIcon(image1));
        m1.setBackground(Color.WHITE);
        
        m2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("collegemanagementsystem.icons/icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m2.setIcon(new ImageIcon(image2));
        m2.setBackground(Color.WHITE);
            
        m1.addActionListener(this);
        m2.addActionListener(this);
          
        JMenu user = new JMenu("Details");
        JMenuItem u1 = new JMenuItem("Student Details");
        JMenuItem u2 = new JMenuItem("Teacher Details");
        user.setForeground(Color.BLACK);
        
        u1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("collegemanagementsystem.icons/icon3.png"));
        Image image4 = icon4.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image4));
        u1.setBackground(Color.WHITE);
        
        u2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("collegemanagementsystem.icons/icon4.jpg"));
        Image image5 = icon5.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        u2.setIcon(new ImageIcon(image5));
        u2.setBackground(Color.WHITE);
        
        u1.addActionListener(this);
        u2.addActionListener(this);
        
        JMenu attendance = new JMenu("Attendance");
        JMenuItem a1 = new JMenuItem("Student Attendance");
        JMenuItem a2 = new JMenuItem("Teacher Attendance");
        attendance.setForeground(Color.BLACK);
        
        a1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon23 = new ImageIcon(ClassLoader.getSystemResource("collegemanagementsystem.icons/icon14.jpg"));
        Image image24 = icon23.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        a1.setIcon(new ImageIcon(image24));
        a1.setBackground(Color.WHITE);
        attendance.add(a1);
        
        a2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon25 = new ImageIcon(ClassLoader.getSystemResource("collegemanagementsystem.icons/icon15.png"));
        Image image26 = icon25.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        a2.setIcon(new ImageIcon(image26));
        a2.setBackground(Color.WHITE);
        attendance.add(a2);

        a1.addActionListener(this);
        a2.addActionListener(this);
        
        JMenu attendance_detail = new JMenu("Attendance Detail");
        JMenuItem b1 = new JMenuItem("Student Attendance Detail");
        JMenuItem b2 = new JMenuItem("Teacher Attendance Detail");
        attendance_detail.setForeground(Color.BLACK);
        
        b1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon27 = new ImageIcon(ClassLoader.getSystemResource("collegemanagementsystem.icons/icon15.png"));
        Image image28 = icon27.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        b1.setIcon(new ImageIcon(image28));
        b1.setBackground(Color.WHITE);
        attendance_detail.add(b1);
        
        b2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon29 = new ImageIcon(ClassLoader.getSystemResource("collegemanagementsystem.icons/icon14.jpg"));
        Image image30 = icon29.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        b2.setIcon(new ImageIcon(image30));
        b2.setBackground(Color.WHITE);
        attendance_detail.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
                
        JMenu exam = new JMenu("Examination");
        JMenuItem c2 = new JMenuItem("Enter Marks");
        exam.setForeground(Color.BLACK);

        c2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon32 = new ImageIcon(ClassLoader.getSystemResource("collegemanagementsystem.icons/icon17.png"));
        Image image33 = icon32.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c2.setIcon(new ImageIcon(image33));
        c2.setBackground(Color.WHITE);
        exam.add(c2);

        c2.addActionListener(this);
        
        JMenu report = new JMenu("Update Details");
        JMenuItem r1 = new JMenuItem("Update Students");
        JMenuItem r2 = new JMenuItem("Update Teachers");
        report.setForeground(Color.BLACK);
        
        r1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("collegemanagementsystem.icons/icon5.png"));
        Image image7 = icon7.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        r1.setIcon(new ImageIcon(image7));
        r1.setBackground(Color.WHITE);
        
        r1.addActionListener(this);
        
        r2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon iconn = new ImageIcon(ClassLoader.getSystemResource("collegemanagementsystem.icons/icon6.png"));
        Image imagee = iconn.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        r2.setIcon(new ImageIcon(imagee));
        r2.setBackground(Color.WHITE);
        
        r2.addActionListener(this);
        
        JMenu fee = new JMenu("Fee Details");
        JMenuItem s1 = new JMenuItem("Fee Structure");
        JMenuItem s2 = new JMenuItem("Student Fee Form");
        fee.setForeground(Color.BLACK);
        
        s1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon14 = new ImageIcon(ClassLoader.getSystemResource("collegemanagementsystem.icons/icon7.png"));
        Image image15 = icon14.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        s1.setIcon(new ImageIcon(image15));
        s1.setBackground(Color.WHITE);
        
        s1.addActionListener(this);
        
        s2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon16 = new ImageIcon(ClassLoader.getSystemResource("collegemanagementsystem.icons/icon8.png"));
        Image image17 = icon16.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        s2.setIcon(new ImageIcon(image17));
        s2.setBackground(Color.WHITE);
        
        s2.addActionListener(this);

        JMenu about = new JMenu("About");
        JMenuItem aboutus = new JMenuItem("About Us");
        about.setForeground(Color.BLACK);
        
        aboutus.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon21 = new ImageIcon(ClassLoader.getSystemResource("collegemanagementsystem.icons/icon13.jpg"));
        Image image22 = icon21.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        aboutus.setIcon(new ImageIcon(image22));
        aboutus.setBackground(Color.WHITE);
        about.add(aboutus);
        aboutus.addActionListener(this);

        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.BLACK);
        
        ex.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("collegemanagementsystem.icons/icon12.png"));
        Image image11 = icon11.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
        ex.setBackground(Color.WHITE);
        
        ex.addActionListener(this);
        
        master.add(m1);
        master.add(m2);
        
        user.add(u1);
        user.add(u2);
        
        report.add(r1);
        report.add(r2);
        
        fee.add(s1);
        fee.add(s2);
        
        exit.add(ex);
         
        mb.add(master);
        mb.add(user);
        mb.add(attendance);
        mb.add(attendance_detail);
        mb.add(exam);
        mb.add(report);
        mb.add(fee);
        mb.add(about);
        mb.add(exit);
        
        setJMenuBar(mb);            
        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
    }
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("New Student Admission")){
            new AddStudent().f.setVisible(true);            
        }else if(msg.equals("New Faculty")){
            new AddTeacher().f.setVisible(true);            
        }else if(msg.equals("Student Details")){
            new StudentDetails().setVisible(true);            
        }else if(msg.equals("Teacher Details")){
            new TeacherDetails().setVisible(true);         
        }else if(msg.equals("Update Students")){
            new UpdateStudent().f.setVisible(true);           
        }else if(msg.equals("Update Teachers")){
            new UpdateTeacher().f.setVisible(true);           
        }else if(msg.equals("Fee Structure")){
            new FeeStructure().setVisible(true);           
        }else if(msg.equals("Student Fee Form")){
            new StudentFeeForm().setVisible(true);
        }else if(msg.equals("Exit")){
            System.exit(0);
        }else if(msg.equals("About Us")){
            new AboutUs().setVisible(true);
        }else if(msg.equals("Student Attendance")){
            new StudentAttendance().setVisible(true);
        }else if(msg.equals("Teacher Attendance")){
            new TeacherAttendance().setVisible(true);
        }else if(msg.equals("Student Attendance Detail")){
            new StudentAttendanceDetail().setVisible(true);
        }else if(msg.equals("Teacher Attendance Detail")){
            new TeacherAttendanceDetail().setVisible(true);
        }else if(msg.equals("Enter Marks")){
            new EnterMarks().setVisible(true);
        }        
    }
        
    public static void main(String[] args){
        new Project().setVisible(true);
    }
    
}
