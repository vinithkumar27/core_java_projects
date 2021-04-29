import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
class one  implements MouseMotionListener,ActionListener
   {   JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23;
       JButton b1,b2,b3,b4,b5,b6,b7;  
       JComboBox cb1,cb2,cb3,birthDate,birthMonth,birthYear,cb4,cb5;
       JTextField tf1,tf3,tf4,tf6,tf7,tf9,tf10,tf11,tf12,tf13,tf14,tf15,tf16;
       JFrame f;  
       Choice c;
      JPasswordField tf2,tf8;
       String s1,s2,s3,s4,s5,s6,s7;
       JSpinner spinner,spinner1,spinner2;
         one()
             {
                   f = new JFrame("Student register");
                    l1 = new JLabel("For Staffs...");
                    l1.setBounds(30,140,300,50); 
                    l1.setFont(new Font("Serif",Font.BOLD,35));
                    f.add(l1);
                    l2 = new JLabel("Student Register");
                    l2.setBounds(30,100,300,50);
                    l2.setFont(new Font("Serif",Font.BOLD,35));
                    f.add(l2);    
                    l3 = new JLabel();
                    l3.setBounds(20,0,160,40);
                    f.add(l3);
                    l4 = new JLabel("Username");
                    l4.setBounds(40,210,150,50);
                    l4.setFont(new Font("Serif",Font.BOLD,26));
                    f.add(l4);
                    tf1 = new JTextField();
                    tf1.setBounds(40,260,200,40);  
                    f.add(tf1); 
                    l5 = new JLabel("Password");
                    l5.setBounds(40,300,150,50);
                    l5.setFont(new Font("Serif",Font.BOLD,26));
                    f.add(l5);
                     tf2 = new JPasswordField();
                    tf2.setBounds(40,350,200,40);  
                    f.add(tf2);
                   b1 = new JButton("Log-in");
                   b1.setBounds(40,420,100,40);
                   f.add(b1);
                   b2 = new JButton("Register");
                   b2.setBounds(160,420,100,40);
                   f.add(b2);
                   b3 = new JButton("Exit");
                   b3.setBounds(100,480,100,40);
                   f.add(b3);
                   f.getContentPane().setBackground(Color.pink);
                   f.setSize(400,700);
                   f.setLayout(null);
                   f.setVisible(true);
                   f.addMouseMotionListener(this);
                   f.addMouseMotionListener(this);
                   b1.addActionListener(this);
                   b2.addActionListener(this);
                   b3.addActionListener(this);
                   b4 = new JButton("Submit");  
                   b4.addActionListener(this);
                   tf1.addActionListener(this);
                   tf2.addActionListener(this);
                   b5 = new JButton("Back");
                   b5.addActionListener(this);
                   b6 = new JButton("submit");
                   b6.addActionListener(this);
                   b7 = new JButton("add student");
                   b7.addActionListener(this);
              }
          public void mouseMoved(MouseEvent e)
             {
                 l3.setText("X= "+e.getX()+" ,Y="+e.getY());
             }
         public void mouseDragged(MouseEvent e)
             {
 
              }
          public void actionPerformed(ActionEvent e)
              {
                  if(e.getActionCommand().equals("Register")) 
                     { 
                          f.setVisible(false);
                          l1.setVisible(false); 
                          l2.setVisible(false);
                          l3.setVisible(false);
                          l4.setVisible(false);
                          l5.setVisible(false);
                          b1.setVisible(false);
                          b2.setVisible(false);
                          b3.setVisible(false);
                          tf2.setVisible(false);
                          tf1.setVisible(false);    
                          String student_file[] = {"   ","Bachelor of Arts","Bachelor of Engineering","D.Ed","B.Ed","M.Ed"};
                          String bloodgroup[] ={"    ","B+","B-","A+","A-","AB+","AB-","O+","O-"};
                         cb1 = new JComboBox(student_file);
                         cb2 = new JComboBox(bloodgroup);
                          f.setSize(400,700);
                          f.setLayout(null);
                          f.setVisible(true);
                          f.getContentPane().setBackground(Color.pink);
                          l6 = new JLabel("Staff-Register");
                          l6.setBounds(30,50,300,60);
                          l6.setFont(new Font("Serif",Font.BOLD,35)); 
                          f.add(l6);
                          l7 = new JLabel("Username");
                          l7.setBounds(30,130,150,50);
                          l7.setFont(new Font("Serif",Font.BOLD,26));
                          f.add(l7);
                          tf3 = new JTextField();
                          tf3.setBounds(190,140,150,30);
                          f.add(tf3);
                          l8 = new JLabel("Qualification");
                          l8.setBounds(30,180,180,50);
                          l8.setFont(new Font("Serif",Font.BOLD,26));
                          f.add(l8);
                          cb1.setBounds(190,190,150,30);
                          cb1.setFont(new Font("Serif",Font.BOLD,15)); 
                          f.add(cb1);
                          l9 = new JLabel("DOB");
                          l9.setBounds(30,230,180,50);
                          l9.setFont(new Font("Serif",Font.BOLD,26));
                          f.add(l9);
                          Container contentPane = f.getContentPane();
                          SpinnerModel value = new SpinnerNumberModel(10,1,31,1);
                           spinner = new JSpinner(value);
                          spinner.setBounds(190,240,50,30);
                          f.add(spinner);   
                          String months[] ={"jan","feb","mar","apr","may","june","july","aug","sep","oct","nov","dec"};
                          SpinnerModel value1 = new SpinnerListModel(months);
                          spinner1 = new JSpinner(value1);
                          contentPane.add(spinner1,BorderLayout.NORTH);
                          spinner1.setBounds(240,240,50,30);
                          f.add(spinner1);
                         String year[] ={"1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000"};
                          SpinnerModel value2 = new SpinnerListModel(year);
                          spinner2 = new JSpinner(value2);
                          contentPane.add(spinner2,BorderLayout.NORTH);
                          spinner2.setBounds(290,240,50,30);
                          f.add(spinner2);
                          l10 = new JLabel("mobileno.");
                          l10.setBounds(30,280,180,50);
                          l10.setFont(new Font("Serif",Font.BOLD,26));
                          f.add(l10);
                           tf6 = new JTextField();
                          tf6.setBounds(190,290,150,30);
                          f.add(tf6);
                          l11 = new JLabel("e-mail ID");
                          l11.setBounds(30,330,180,50);
                          l11.setFont(new Font("Serif",Font.BOLD,26));
                          f.add(l11);
                           tf7 = new JTextField();
                          tf7.setBounds(190,340,150,30);
                          f.add(tf7);
                          l12 = new JLabel("Blood Group");
                          l12.setBounds(30,380,180,50);
                          l12.setFont(new Font("Serif",Font.BOLD,26));
                          f.add(l12);
                          cb2.setBounds(190,390,150,30);
                          cb2.setFont(new Font("Serif",Font.BOLD,15)); 
                          f.add(cb2);   
                          l13 = new JLabel("password");
                          l13.setBounds(30,430,180,50);
                          l13.setFont(new Font("Serif",Font.BOLD,26));
                          f.add(l13);
                          tf8 = new JPasswordField();
                          tf8.setBounds(190,440,150,30);
                          f.add(tf8);        
                          b4.setBounds(140,500,100,40);
                          f.add(b4); 
                      }
                  else if(e.getActionCommand().equals("Submit"))
                      {
                          s1 = tf3.getText();
                          s2 = cb1.getSelectedItem() + "";
                          s3 =spinner.getValue()+"-"+spinner1.getValue()+"-"+spinner2.getValue(); 
                          s4 = tf6.getText();
                          s5 = tf7.getText();
                          s6 = cb2.getSelectedItem() + "";
                          s7 = tf8.getText();
                              try
                                {
                                     FileWriter w = new FileWriter("GFG.txt",true);
                                     w.write("Name              :"+s1+"\n");
                                     w.write("Qualification : "+s2+"\n");
                                     w.write("DOB               : "+s3+"\n");
                                     w.write("mobileno.      : "+s4+"\n");
                                     w.write("e-mail ID        : "+s5+"\n");
                                     w.write("Blood Group : "+s6+"\n");
                                     w.write("password      : "+s7+"\n");
                                     w.close();
                                 }catch(Exception o){System.out.println(o);}
                         JOptionPane.showMessageDialog( f,"Successfully Saved"+" The Details");
                         l6.setVisible(false); 
                         l7.setVisible(false);
                         l8.setVisible(false);
                         l9.setVisible(false);
                         l10.setVisible(false);
                         l11.setVisible(false);
                         l12.setVisible(false);
                         l13.setVisible(false);
                         tf3.setVisible(false);
                         tf6.setVisible(false);
                         tf7.setVisible(false);
                         tf8.setVisible(false);
                         cb1.setVisible(false); 
                         cb2.setVisible(false);
                         b4.setVisible(false); 
                         spinner.setVisible(false);
                         spinner1.setVisible(false);
                         spinner2.setVisible(false);

                           f.setVisible(true);
                          l1.setVisible(true);
                          l2.setVisible(true); 
                          l3.setVisible(true);
                          l4.setVisible(true);
                          l5.setVisible(true);
                          b1.setVisible(true);
                          b2.setVisible(true);
                          b3.setVisible(true);
                          tf2.setVisible(true);
                          tf1.setVisible(true);
                      }
                 else if(e.getActionCommand().equals(s1))
                     {
                      System.out.println("Welcome "+tf1.getText()+"....");
                     }
                        else if(e.getActionCommand().equals(s7))
                     {
                       System.out.println("password good"); 
                     }        

                 else if(e.getActionCommand().equals("Log-in"))
                     {
                        f.setVisible(false);
                        l1.setVisible(false);
                        l4.setVisible(false);
                        l5.setVisible(false);
                        b1.setVisible(false);
                        b2.setVisible(false);
                        b3.setVisible(false);
                        l2.setVisible(false);
                        tf2.setVisible(false);
                        tf1.setVisible(false);
                        f.setSize(400,700);
                        f.setLayout(null);
                           f.setVisible(true);
                           f.getContentPane().setBackground(Color.pink);
                           l14 = new JLabel("Student Registry");
                           l14.setFont(new Font("Serif",Font.BOLD,26));
                           l14.setBounds(20,20,200,60); 
                           f.add(l14);
                           b5.setVisible(true);  
                           b5.setFont(new Font("Serif",Font.BOLD,26)); 
                           b5.setBounds(80,550,100,40);
                           f.add(b5);
                          l15 = new JLabel("Student name");
                          l15.setBounds(30,80,160,50);
                          l15.setFont(new Font("Serif",Font.BOLD,26));
                          f.add(l15);
                          tf9 = new JTextField();
                          tf9.setBounds(210,90,150,30);
                          f.add(tf9);
                          l16 = new JLabel("father's name");
                          l16.setBounds(30,130,160,50);
                          l16.setFont(new Font("Serif",Font.BOLD,26));
                          f.add(l16);
                          tf10 = new JTextField();
                          tf10.setBounds(210,140,150,30);
                          f.add(tf10);
                          l17 = new JLabel("father's no.");
                          l17.setBounds(30,180,160,50);
                          l17.setFont(new Font("Serif",Font.BOLD,26));
                          f.add(l17);
                          tf11 = new JTextField();
                          tf11.setBounds(210,190,150,30);
                          f.add(tf11); 
                          l18 = new JLabel("student no.");
                          l18.setBounds(30,230,160,50);
                          l18.setFont(new Font("Serif",Font.BOLD,26));
                          f.add(l18);
                          tf12 = new JTextField();
                          tf12.setBounds(210,240,150,30);
                          f.add(tf12);
                           l19 = new JLabel("address");
                          l19.setBounds(30,280,160,50);
                          l19.setFont(new Font("Serif",Font.BOLD,26));
                          f.add(l19);
                          tf13 = new JTextField();
                          tf13.setBounds(210,290,150,30);
                          f.add(tf13);
                          l20 = new JLabel("SSLC mark");
                          l20.setBounds(30,330,160,50);
                          l20.setFont(new Font("Serif",Font.BOLD,26));
                          f.add(l20);
                          tf14 = new JTextField();
                          tf14.setBounds(210,340,150,30);
                          f.add(tf14);
                           l21 = new JLabel("HSC mark");
                          l21.setBounds(30,380,160,50);
                          l21.setFont(new Font("Serif",Font.BOLD,26));
                          f.add(l21);
                          tf15 = new JTextField();
                          tf15.setBounds(210,390,150,30);
                          f.add(tf15);
                          l22 = new JLabel("Blood group");
                          l22.setBounds(30,430,160,50);
                          l22.setFont(new Font("Serif",Font.BOLD,26));
                          f.add(l22);
                          l23 = new JLabel("Branch");
                          l23.setBounds(30,480,160,50);
                          l23.setFont(new Font("Serif",Font.BOLD,26));
                          f.add(l23);
                           b6.setVisible(true);  
                           b6.setFont(new Font("Serif",Font.BOLD,26)); 
                           b6.setBounds(200,550,120,40);
                           f.add(b6);
                           String bloodgroup1[] ={"    ","B+","B-","A+","A-","AB+","AB-","O+","O-"};
                           cb5 = new JComboBox(bloodgroup1);
                          cb5.setBounds(210,440,150,30);
                          cb5.setFont(new Font("Serif",Font.BOLD,15)); 
                          f.add(cb5);
                          String branch[] ={"    ","civil Eng.","mech Eng.","ECE","EEE","CSE","IT","Bio Med."};
                          cb4 = new JComboBox(branch);
                          cb4.setBounds(210,490,150,30);
                          cb4.setFont(new Font("Serif",Font.BOLD,15)); 
                          f.add(cb4);
                           b7.setVisible(true);  
                           b7.setFont(new Font("Serif",Font.BOLD,26)); 
                           b7.setBounds(110,600,180,40);
                           f.add(b7);
                     }
                 else if(e.getActionCommand().equals("add student"))
                     { 
                          tf9.setText("   ");
                          tf10.setText("   ");                          
                          tf11.setText("   ");
                          tf12.setText("   ");
                          tf13.setText("   ");
                          tf14.setText("   ");
                          tf15.setText("   ");
                         cb4.setSelectedIndex(0);
                         cb5.setSelectedIndex(0);
                      }
                 else if(e.getActionCommand().equals("submit"))
                      {
                          ArrayList<String> a = new ArrayList<String>();
                          a.add(tf9.getText());
                          a.add(tf10.getText());
                          a.add(tf11.getText());
                          a.add(tf12.getText());
                          a.add(tf13.getText());
                          a.add(tf14.getText());
                          a.add(tf15.getText());
                          a.add(cb4.getSelectedItem() + "");
                          a.add(cb5.getSelectedItem() + "");
                              try
                                {
                                     FileWriter w = new FileWriter("student registry.txt",true);
                                     String s1 = a.get(0);
                                     String s2 = a.get(1);
                                     String s3 = a.get(2);
                                     String s4 = a.get(3);                                     
                                    String s5 = a.get(4);
                                    String s6 = a.get(5);
                                    String s7 = a.get(6);
                                    String s8 = a.get(7);
                                    String s9 = a.get(8);
                                     w.write("Name              :"+s1+"\n");
                                     w.write("father name   : "+s2+"\n");
                                     w.write("father no.       : "+s3+"\n");
                                     w.write("student no.    : "+s4+"\n");
                                     w.write("address         : "+s5+"\n");
                                     w.write("SSLC mark    : "+s6+"\n");
                                     w.write("HSC mark      : "+s7+"\n");
                                     w.write("Blood group : "+s8+"\n");
                                     w.write("Branch          : "+s9+"\n");
                                     w.close();
                                 }catch(Exception o){System.out.println(o);}
                        JOptionPane.showMessageDialog( f,"Successfully Saved"+" The Details");
                         l14.setVisible(false);
                         l15.setVisible(false);
                         l16.setVisible(false);
                         l17.setVisible(false);
                         l18.setVisible(false);
                         l19.setVisible(false);
                         l20.setVisible(false); 
                         l21.setVisible(false);
                         l22.setVisible(false);
                         l23.setVisible(false);
                         tf9.setVisible(false);
                         tf10.setVisible(false);
                         tf11.setVisible(false);
                         tf12.setVisible(false);
                         tf13.setVisible(false);
                         tf14.setVisible(false); 
                         tf15.setVisible(false);
                         cb4.setVisible(false);
                         cb5.setVisible(false);
                         b6.setVisible(false);
                         b5.setVisible(false);
                         b7.setVisible(false);
                        
                          l14.setVisible(false);
                          l3.setVisible(false);
                          b5.setVisible(false);
                          f.setVisible(false); 
                          f.setSize(400,700);
                          f.setLayout(null);   
                          f.setVisible(true);
                          f.getContentPane().setBackground(Color.pink);  
                          l1.setVisible(true);
                          l2.setVisible(true); 
                          l3.setVisible(true);
                          l4.setVisible(true);
                          l5.setVisible(true);
                          b1.setVisible(true);
                          b2.setVisible(true);
                          b3.setVisible(true);
                           tf2.setVisible(true);
                          tf1.setVisible(true);
                          
                           }
               else if(e.getActionCommand().equals("Back"))
                    {
                          tf9.setVisible(false);
                          tf10.setVisible(false);
                          tf11.setVisible(false);
                          tf12.setVisible(false);
                          tf13.setVisible(false);
                          l15.setVisible(false);
                          l16.setVisible(false);
                          l17.setVisible(false);
                          l18.setVisible(false);
                          l19.setVisible(false);
                          l20.setVisible(false);
                          l21.setVisible(false);
                          l22.setVisible(false); 
                          l23.setVisible(false);
                          tf14.setVisible(false);
                          tf15.setVisible(false);
                          cb4.setVisible(false);
                          cb5.setVisible(false);
                          b6.setVisible(false);
                          b7.setVisible(false);
                          l14.setVisible(false);
                          l3.setVisible(false);
                          b5.setVisible(false);
                          f.setVisible(false); 
                          f.setSize(400,700);
                          f.setLayout(null);   
                          f.setVisible(true);
                          f.getContentPane().setBackground(Color.pink);  
                          l1.setVisible(true);
                          l2.setVisible(true); 
                          l3.setVisible(true);
                          l4.setVisible(true);
                          l5.setVisible(true);
                          b1.setVisible(true);
                          b2.setVisible(true);
                          b3.setVisible(true);
                          tf2.setVisible(true);
                          tf1.setVisible(true);
                         
                    }
                 else if(e.getActionCommand().equals("Exit"))
                     {
                          f.dispose();
                     }
                 else
                    {
                          System.out.println("click correct one");
                     }
                }
   } 

class student
   {
        public static void main(String[] args)
           {
                one obj = new one();
           }
   }