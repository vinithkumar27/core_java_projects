package mypackages;
import java.io.*;
public class input
    {
         public void getdata()
            {
               try
                 {
                  DataInputStream in = new DataInputStream(System.in);
                  System.out.println("Enter your name please ....");
                  String name = in.readLine();
                  System.out.println("Enter your age please");
                  int age = Integer.parseInt(in.readLine());
                   }catch(Exception y){}
             }
     }