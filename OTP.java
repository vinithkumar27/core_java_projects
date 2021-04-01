package mypackages;
import java.io.*;
public class OTP extends Thread
    {
       DataInputStream in = new DataInputStream(System.in);
       StringBuffer sbf = new StringBuffer();
       Thread t = new Thread(this);   
        public void OTP()
               {
                  String numbers ="1234567890";
                  char[] otp = new char[10];
                  for(int i=0;i<6;i++)
                    {
                          int rand =(int)(Math.random()*numbers.length());
                          otp[i]=numbers.charAt(rand);
                     } 
                  sbf.append(otp);
                  System.out.print("    OTP for you number is   ");
                  for(int j=0;j<6;j++)
                    {
                         try
                        {
                        System.out.print(otp[j]);
                        t.sleep(200);
                         }catch(Exception t){}
                     }System.out.println();
                         try{
                     System.out.println("Enter your OTP Please");
                     String getotp = in.readLine();
                      System.out.println(sbf.getClass().getSimpleName());
                      System.out.println(getotp.getClass().getSimpleName());
                    if(getotp.equals(sbf))
                        {
                             System.out.println("your OTP is correct...");
                             start();
                        }   
                     else
                        {
                             System.out.println("your entered OTP is Worng...\n we resent a OTP to your registered mobile number");
                             OTP();
                         } 
                       }catch(Exception w){}
                   }
    	}