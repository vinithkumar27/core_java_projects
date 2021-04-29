import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener; 
class one extends Frame implements ActionListener,MouseListener,WindowListener,MouseMotionListener
   {
      Label l1,l2;
      TextField t1,t2;
      Button b1;
       one()
            {
                   setLayout(null); 
                   setVisible(true);
                    setSize(600,400);
                    setBackground(Color.pink);
                    setTitle("Shervoroys");
                    Panel p =new Panel(new GridLayout(2,2));
                     l1 = new Label("Username");
                     l2 = new Label("Password");
                     t1 = new TextField();
                     t2 = new TextField();
                     p.add(l1);
                     p.add(t1);
                     p.add(l2);
                     p.add(t2);
                     add(p);
                     p.setBounds(160,100,240,70);
                     b1 =new Button("Submit");
                     add(b1);
                     b1.setBounds(250,200,70,40);
                      b1.addActionListener(this);
                      addMouseListener(this); 
                      addWindowListener(this);
                      addMouseMotionListener(this);
             }

       public void actionPerformed(ActionEvent d)
         {
               if(t1.getText().equals("vinithkumar"))
                 { 
                      System.out.println("Hi Vinith");
                  }
                else
                    {
                        System.out.println("Enter your registered username");
                    }
               if(t2.getText().equals("123456"))
                    {
                          System.out.println("log in");
                     }
                 else
                     {
                          System.out.println("Enter your correct password or forgot password");
                     }
         }

       public void mouseExited(MouseEvent d)
           {
                setBackground(Color.cyan);
           }
       public void mouseEntered(MouseEvent d)
         {
                setBackground(Color.lightGray);
          }
        public void mouseReleased(MouseEvent d)
           {
 
            }
        public void mousePressed(MouseEvent d)
            {

             }
         public void mouseClicked(MouseEvent d)
            {
                     setBackground(Color.white);
             }
 
    public void windowActivated(WindowEvent d)
          {  
               System.out.println("activated");  
          }  
    public void windowClosed(WindowEvent d) 
         {  
               System.out.println("closed");  
         }  
    public void windowClosing(WindowEvent d)
        {  
              System.out.println("closing");  
              dispose();  
        }  
   public void windowDeactivated(WindowEvent d) 
       {  
             System.out.println("deactivated");  
       }  
   public void windowDeiconified(WindowEvent d)
       {  
             System.out.println("deiconified");  
       }  
   public void windowIconified(WindowEvent d)
      {  
             System.out.println("iconified");  
      }  
    public void windowOpened(WindowEvent d)
       {  
             System.out.println("opened");  
        }  

    public void mouseDragged(MouseEvent e) 
       {  
            Graphics g=getGraphics();  
            g.setColor(Color.red);  
            g.fillOval(e.getX(),e.getY(),40,40);  
       } 
     public void mouseMoved(MouseEvent e){}  
    }

class awt
   {
        public static void main(String[] arg)
            {
                 one obj = new one();
             }
    }