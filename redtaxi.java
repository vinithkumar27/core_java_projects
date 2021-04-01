import java.io.*;
class frontpage
    {
           int i=0;
           int k=1;
           long a=1234567890l;
           int OTP = 1234;
           DataInputStream in = new DataInputStream(System.in);
           frontpage()
                {
                      System.out.println("Welcome to **Red Taxi!**");
                      frontpage1();
                 }     
           public void  frontpage1()
                {
                   try
                     {
                    
                       System.out.println("Enter your which type of user login/signup/phonebooking");
                       String usertype = in.readLine();
                       if(usertype.equals("login"))
                          {
                               Login();
                           }
                       else if(usertype.equals("signup"))
                          {
                              Signup();
                           }
                       else if(usertype.equals("phonebooking"))
                           {
                               PhoneBooking();
                           }
                       else
                          {
                              System.out.println("Please type same as dispalyed words");
                              frontpage1();    
                           }
                     }catch(Exception a){}
                 }

           public void Login()
               {
                  try
                    {   
                          System.out.println("Mobile Number ");
                          Long mobilenumber = Long.valueOf(in.readLine()).longValue();
                           if(mobilenumber == a)
                               {
                                  loginpassword();
                               }
                           else
                               {
                                      System.out.println("Enter registered mobile Number");
                                       Login();
                                }  
                     }catch(Exception s){}
                }
              
           public void loginpassword()
                {
                       try
                         {
                             System.out.println("Password");
                                String password = in.readLine();
                                if(password.equals("hello world"))
                                    {
                                        mainpage();
                                    }
                                 else if(i<2)
                                     {
                                          System.out.println("incorrect password");
                                          i++;
                                          loginpassword();
                                      }
                                 else 
                                       {
                                           forgotpassword();
                                       }     
                             }catch(Exception f){}   
                    }

            public void Signup()
                {
                         try
                           {
                         System.out.println("Give Us Your Mobile Number Add,You Will Receive the OTP to That ");
                         System.out.print("Mobile Number\t");
                         long signupnumber =Long.valueOf(in.readLine()).longValue();
                         System.out.println("Get OTP");
                         System.out.println("Verify OTP");
                         System.out.println("You have Received OTP to Your Registered Mobile Number");
                         System.out.print("Enter OTP\t");
                         int verifyOTP = Integer.parseInt(in.readLine());
                         if(verifyOTP == OTP)
                            {
                                  profiledetails();
                             }
                          else
                             {
                                 System.out.println("Please enter correct OTP");
                                 Signup();
                             }
                            }catch(Exception r){}
                 }

             public void profiledetails()
                 {
                    try
                      {
                      System.out.println("Profile Details");
                      System.out.print("Enter Name\t");
                      String profilename = in.readLine();
                      System.out.print("Enter mail ID\t");
                      String Email = in.readLine();
                      profilepassword();
                       }catch(Exception r){} 
                 }
             public void profilepassword()
                 {
                    try
                      {
                      System.out.print("Enter Password\t");
                      String password = in.readLine();
                      System.out.print("Enter Confirm Password\t");
                      String confirmpassword = in.readLine();
                      if(password.equals(confirmpassword))
                          {
                                 System.out.println("Create Account");
                                 mainpage();
                          }  
                       else 
                          {
                                 System.out.println("Please Enter a password same as confirm password");
                                  profilepassword();
                           }  
                         }catch(Exception h){}
                  }
              public void mainpage()
                  {
                    try
                      {
                      System.out.println("Enter your chect-in location to pick up");
                      String[] pickup = {"shevapet","fairlands","fourroads","nethimedu"};
                      for(int j=0;j<=3;j++)
                          {
                               System.out.println(pickup[j]);
                           }
                      String checkin = in.readLine();
                      System.out.println("Enter your check-out location to drop");
                      String[] drop ={"Salem Railway Station","Salem Bus Stand","DMart","ARRS Multiplex","Reliance Mall"};
                      for(int i=0;i<=3;i++)
                         {
                             System.out.println(drop[i]);
                          }
                      String checkout = in.readLine();
                      System.out.println("The Available cars are ");
                      String[] cars={"sedan","mini"};
                      for(int k=0;k<=1;k++)
                           {
                               System.out.println(cars[k]); 
                           }
                       System.out.println("Our RedTaxi cars are ");
                       String redcars = in.readLine();
                       if(redcars.equals("sedan"))
                           {
                               if(checkin.equals("shevapet"))
                                   {
                                        if(checkout.equals("Salem Railway Station"))
                                             {
                                                   System.out.println("Base fare -200");
                                                   sent();
                                             }
                                       else if(checkout.equals("Salem Bus Stand"))
                                             { 
                                                   System.out.println("Base fare -140");
                                                   sent();     
                                             }
                                        else if(checkout.equals("DMart"))
                                             {
                                                    System.out.println("Base fare -160");
                                                    sent();
                                             }
                                        else if(checkout.equals("ARRS Multiplex"))
                                             {
                                                   System.out.println("Base fare -120");
                                                   sent();
                                             }
                                       else if(checkout.equals("Reliance Mall"))
                                             {
                                                    System.out.println("Base fare -150");
                                                    sent();
                                             }
                                       else
                                             {
                                                   System.out.println("Sorry our service is not available at this location ");
                                                   System.exit(0);
                                             }
                                      }
                                  else if(checkin.equals("fairlands"))
                                        {
                                              if(checkout.equals("Salem Railway Station"))
                                             {
                                                   System.out.println("Base fare -120");
                                                   sent();
                                             }
                                       else if(checkout.equals("Salem Bus Stand"))
                                             { 
                                                   System.out.println("Base fare -40");
                                                   sent();     
                                             }
                                        else if(checkout.equals("DMart"))
                                             {
                                                    System.out.println("Base fare -80");
                                                    sent();
                                             }
                                        else if(checkout.equals("ARRS Multiplex"))
                                             {
                                                   System.out.println("Base fare -70");
                                                   sent();
                                             }
                                       else if(checkout.equals("Reliance Mall"))
                                             {
                                                    System.out.println("Base fare -90");
                                                    sent();
                                             }
                                       else
                                             {
                                                   System.out.println("Sorry our service is not available at this location ");
                                                   System.exit(0);
                                             }
                                        }
                                   else if(checkin.equals("fourroads"))
                                        {
                                       if(checkout.equals("Salem Railway Station"))
                                             {
                                                   System.out.println("Base fare -140");
                                                   sent();
                                             }
                                       else if(checkout.equals("Salem Bus Stand"))
                                             { 
                                                   System.out.println("Base fare -50");
                                                    sent();     
                                             }
                                        else if(checkout.equals("DMart"))
                                             {
                                                    System.out.println("Base fare -90");
                                                    sent();
                                             }
                                        else if(checkout.equals("ARRS Multiplex"))
                                             {
                                                   System.out.println("Base fare -100");
                                                   sent();
                                             }
                                       else if(checkout.equals("Reliance Mall"))
                                             {
                                                    System.out.println("Base fare -80");
                                                    sent();
                                             }
                                       else
                                             {
                                                   System.out.println("Sorry our service is not available at this location ");
                                                   System.exit(0);
                                             }
                                        } 
                                       else if(checkin.equals("nethimedu"))
                                        {
                                       if(checkout.equals("Salem Railway Station"))
                                             {
                                                   System.out.println("Base fare -200");
                                                   sent();
                                             }
                                       else if(checkout.equals("Salem Bus Stand"))
                                             { 
                                                   System.out.println("Base fare -120");
                                                   sent();     
                                             }
                                        else if(checkout.equals("DMart"))
                                             {
                                                    System.out.println("Base fare -150");
                                                     sent();
                                             }
                                        else if(checkout.equals("ARRS Multiplex"))
                                             {
                                                   System.out.println("Base fare -120");
                                                    sent();
                                             }
                                       else if(checkout.equals("Reliance Mall"))
                                             {
                                                    System.out.println("Base fare -140");
                                                    sent();
                                             }
                                       else
                                             {
                                                   System.out.println("Sorry our service is not available at this location ");
                                                   System.exit(0);
                                             }
                                        }
                                        else
                                          {
                                                  System.out.println("Choose a given locations only");
                                                  mainpage();
                                          }
                               }	
                         else
                           {
                             if(redcars.equals("mini"))
                                 {
                               if(checkin.equals("shevapet"))
                                   {
                                        if(checkout.equals("Salem Railway Station"))
                                             {
                                                   System.out.println("Base fare -170"); 
                                                   sent();
                                             }
                                       else if(checkout.equals("Salem Bus Stand"))
                                             { 
                                                   System.out.println("Base fare -120");
                                                   sent();     
                                             }
                                        else if(checkout.equals("DMart"))
                                             {
                                                    System.out.println("Base fare -130");
                                                    sent();
                                             }
                                        else if(checkout.equals("ARRS Multiplex"))
                                             {
                                                   System.out.println("Base fare -100");
                                                   sent();
                                             }
                                       else if(checkout.equals("Reliance Mall"))
                                             {
                                                    System.out.println("Base fare -130");
                                                     sent();
                                             }
                                       else
                                             {
                                                   System.out.println("Sorry our service is not available at this location ");
                                                   System.exit(0);
                                             }
                                      }
                                  else if(checkin.equals("fairlands"))
                                        {
                                              if(checkout.equals("Salem Railway Station"))
                                             {
                                                   System.out.println("Base fare -100");
                                                   sent();
                                             }
                                       else if(checkout.equals("Salem Bus Stand"))
                                             { 
                                                   System.out.println("Base fare -30");
                                                   sent();     
                                             }
                                        else if(checkout.equals("DMart"))
                                             {
                                                    System.out.println("Base fare -60");
                                                    sent();
                                             }
                                        else if(checkout.equals("ARRS Multiplex"))
                                             {
                                                   System.out.println("Base fare -50");
                                                   sent();
                                             }
                                       else if(checkout.equals("Reliance Mall"))
                                             {
                                                    System.out.println("Base fare -70");
                                                    sent();
                                             }
                                       else
                                             {
                                                   System.out.println("Sorry our service is not available at this location ");
                                                   System.exit(0);
                                             }
                                        }
                                   else if(checkin.equals("fourroads"))
                                        {
                                       if(checkout.equals("Salem Railway Station"))
                                             {
                                                   System.out.println("Base fare -120");
                                                   sent();
                                             }
                                       else if(checkout.equals("Salem Bus Stand"))
                                             { 
                                                   System.out.println("Base fare -40");
                                                   sent();     
                                             }
                                        else if(checkout.equals("DMart"))
                                             {
                                                    System.out.println("Base fare -70");
                                                    sent();
                                             }
                                        else if(checkout.equals("ARRS Multiplex"))
                                             {
                                                   System.out.println("Base fare -80");
                                                   sent();
                                             }
                                       else if(checkout.equals("Reliance Mall"))
                                             {
                                                    System.out.println("Base fare -60");
                                                    sent();
                                             }
                                       else
                                             {
                                                   System.out.println("Sorry our service is not available at this location ");
                                                   System.exit(0);
                                             }
                                        } 
                                       else if(checkin.equals("nethimedu"))
                                        {
                                       if(checkout.equals("Salem Railway Station"))
                                             {
                                                   System.out.println("Base fare -180");
                                                   sent();
                                             }
                                       else if(checkout.equals("Salem Bus Stand"))
                                             { 
                                                   System.out.println("Base fare -100");
                                                   sent();     
                                             }
                                        else if(checkout.equals("DMart"))
                                             {
                                                    System.out.println("Base fare -130");
                                                    sent();
                                             }
                                        else if(checkout.equals("ARRS Multiplex"))
                                             {
                                                   System.out.println("Base fare -100");
                                                   sent();
                                             }
                                       else if(checkout.equals("Reliance Mall"))
                                             {
                                                    System.out.println("Base fare -120");
                                                    sent();
                                             }
                                       else
                                             {
                                                   System.out.println("Sorry our service is not available at this location ");
                                                   System.exit(0);
                                             }
                                        }
                                        else
                                          {
                                                  System.out.println("Choose a given locations only");
                                                  mainpage();
                                          }
                               }	
                           }
                       }catch(Exception t){}
                  }

            public void sent()
                  {
                        System.out.println("\tThanks for using redtaxi\n\tWe will sent our driver within 15 minutes");     
                  }

             public void PhoneBooking()
                {
                    try
                      {
                      System.out.println("Get Rs.25 Off !");
                      System.out.println("Signup and get Rs.25 Off for the first \nthree bookings through App,use code \nRED25");
                      System.out.println("Click  Signup or Login  or phonebooking");
                      String off = in.readLine();
                      if(off.equals("Signup") ||  off.equals("Login"))
                         {
                             frontpage1();      
                         }
                      else if(off.equals("phonebooking"))
                         {
                              phonebooking1();
                         }
                      else
                         {
                               System.out.println("Please type same as dispalyed words");
                          }
                      }catch(Exception g){}
                   }

          public void phonebooking1()
               {
                   System.out.println("You can View the Support Team Phone Numbers for the Following\nCities. Choose a City to Proceed");
                   String[][] cities = {{"coimbatore Go","Salem","Trichy","Erode"},{"0422-4455667","0427-4567890","0431-4567890","0424-4567890"}};
                   System.out.println("our car services in cities are");
                   for(int i=0;i<2;i++)
                      {
                          for(int j=0;j<1;j++)
                            {
                                 System.out.println(cities[i][j]);
                            }
                        }
                  for(int i=0;i<2;i++)
                      {
                          for(int j=1;j<2;j++)
                            {
                                 System.out.println(cities[i][j]);
                            }
                        }
                     for(int i=0;i<2;i++)
                      {
                          for(int j=2;j<3;j++)
                            {
                                 System.out.println(cities[i][j]);
                            }
                        } 
                    for(int i=0;i<2;i++)
                       {
                           for(int j=3;j<4;j++)
                              {
                                  System.out.println(cities[i][j]);
                               }
                        }    
                    System.out.println("\tDialing. . . . .");
                    sent();
               }

          public void forgotpassword()
             {
                   try
                    {
                    System.out.println("Forgot Password");
                    System.out.println("Enter Your Registered Mobile Number to Reset Password ");
                    long number1 =Long.parseLong(in.readLine());
                    System.out.println("Get OTP");	
                    if(number1 == a)
                       {
                            System.out.println("We sent a OTP to your Registered mobile number and change your password ");
                            frontpage1();
                       }
                     else
                        {
                               System.out.println("Requested User is not found");
                               forgotpassword();
                        }
                     }catch(Exception g){}         
                 }
   }

class redtaxi 
   {
        public static void main(String[] args)
            { 
                    frontpage red1 = new frontpage();                    
             }
    }