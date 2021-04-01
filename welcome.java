package mypackages;
public class OTP
   {
                  String numbers ="1234567890";
                  char[] otp = new char[10];
                  for(int i=0;i<6;i++)
                    {
                          int rand =(int)(Math.random()*numbers.length());
                          otp[i]=numbers.charAt(rand);
                     } 
                  System.out.println("OTP for you number is ");
                  for(int j=0;j<6;j++)
                    {
                        System.out.print(otp[j]);
                     }       
    }