import java.io.*;
import mypackages.OTP;
class one extends OTP implements Runnable
   { 
       DataInputStream in = new DataInputStream(System.in);  
       Thread t = new Thread(this);
      one()
           {
                String gest ="\n           Welcome  to Shevaroys\n            Your home  in hills";
                for(int i=0;i<=gest.length();i++)
                  {
                    try
                      {
                       System.out.print(gest.charAt(i));
                       t.sleep(90);
                       }catch(Exception f){}
                  } System.out.println();
            }
   
      public void run()
           {
                    System.out.println("Hi vinith welcome you"); 
            }

       public void intro() 
           {
              String intro1 = "             Select Food Items\n\n   Find the best around you with Shevaroys\n  and choose your favourite  food from your\n          favourite restaturant";
                for(int i=0;i<=intro1.length();i++)
                   {
                     try{
                        System.out.print(intro1.charAt(i));
                        t.sleep(90);
                       }catch(Exception p){}
                   }System.out.println();
                 String intro2 ="\n           Order food you like\n\n        order Bryani,Pizza,Masala Dosa,\n      Burgers,Lassi,Cofee,Gulab Jamun,and\n         get more exciting offers";
                  for(int j=0;j<=intro2.length();j++)
                    {
                         try{
                           System.out.print(intro2.charAt(j));
                            t.sleep(90);
                               }catch(Exception g){}
                     }System.out.println();
                  String intro3 ="\n          Deliver to your home\n\n     Delivery Partners trained in the best\n    hygiene protocol and have been equipped \n                with masks";
                    for(int k=0;k<=intro3.length();k++)
                       {
                              try{
                              System.out.print(intro3.charAt(k));
                               t.sleep(90);
                                  }catch(Exception b){}
                        }System.out.println();
              phonenumber();
           } 
 
          public void otpcorrect()
                {
                    System.out.println("Hi vinith welcome you");   
                 }  
                
         public void phonenumber()
            {
                try{
                      System.out.print("Enter your Mobile Number\n  +91  ");
                      long number = Long.parseLong(in.readLine());
                      String robot = "We check you are not a robot..";
                      for(int i=0;i<=robot.length();i++)
                       {
                          try
                            {
                             System.out.print(robot.charAt(i));
                             t.sleep(100);
                             }catch(Exception g){}
                        }
                      System.out.println("\n    We have sent a verification code to +91 - "+number);
                      OTP();
                     }catch(Exception q){}
             }
          
      
      
   }

class shervoroys
   {
        public static void main(String[] args)
            {
                   one obj = new one();
                   obj.intro();        
            }
    }