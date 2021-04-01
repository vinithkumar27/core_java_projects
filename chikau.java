import java.io.*;
class one
    {
       //     String[] totalfoods = new int[10];
         public void welcome()
            {
                  try
                    {
                     DataInputStream in = new DataInputStream(System.in);
                     System.out.println("Welcome to chikau");
                     System.out.println("Enter your mobile no");
                     long mobileno = Long.valueOf(in.readLine()).longValue();
                     System.out.println(mobileno);
                     System.out.println("We have sent a verification code to "+mobileno);
                     System.out.println("Enter your OTP please..");
                     String OTP = in.readLine();
                      if(OTP.equals("1234"))
                         {
                             System.out.println("Click validate button");
                                accessno();
                          }
                       else
                          {
                              System.out.println("Resend OTP");
                              welcome();
                           }
                         }catch(Exception q){}     
                }

          public void accessno()
               {
                   try
                     {
                     DataInputStream in1 = new DataInputStream(System.in);
                     System.out.println("Allow chikau to access this device location  ...yes/no");
                     String locationaccess = in1.readLine();
                     if(locationaccess.equals("yes"))
                       {
                             System.out.println("Thanks for using chikau,we have great deals for you");   
                             categories();   
                        }
                      else
                        {
                             System.out.println("Sorry you can only use this software by enable location access permission");                                  accessno();
                         }
                        }catch(Exception w){}
                 }
             public void categories()
                    { 
                       try
                         {
                         DataInputStream in2 = new DataInputStream(System.in);
                         System.out.println("you wish want to shop in chikau  ...yes/no");
                         String permi = in2.readLine();
                         if(permi.equals("yes"))
                            {
                                  System.out.println("We have fresh products for you");
                            }
                          else
                             {
                                 exit();    
                             }
                         String[] categories ={"seafoods","mutton","chicken","egg"}; 
                         System.out.println("our food products are ");
                            for(int i=0;i<=3;i++)
                               {
                                  System.out.print(categories[i]+"  ");
                               }System.out.println();
                          System.out.println("Select a food what do you want");
                          String select = in2.readLine();
                          if(select.equals(categories[0]))
                             {
                                   seafoods();
                              }
                            else if(select.equals(categories[1]))
                               {
                                      mutton();
                                }
                             else if(select.equals(categories[2]))
                                { 
                                     chicken();
                                 }
                              else if(select.equals(categories[3]))
                                 {
                                     egg();
                                 }
                               else
                                  {
                                          System.out.println("Please select a correct food you want"); 
                                   }     
                            }catch(Exception u){}
                     }
     
           public void seafoods()
                 {
                  try
                   {
                    DataInputStream in3 = new DataInputStream(System.in);
                    System.out.println("Order you need");
                    System.out.println("You want seafoods  ..yes/no");
                    String permi = in3.readLine();
                         if(permi.equals("yes"))
                             {
                                  System.out.println("we have more new products for you");
                              }
                          else
                               {
                                    categories();   
                               }
                    String[] seafoods ={"crab","dam paarai","cutla","maththi","rohu","salmon"};
                    for(int j=0;j<=5;j++)
                       {
                           System.out.print(seafoods[j]+"  ");
                        }System.out.println();
                    String select1  = in3.readLine(); 
                    if(select1.equals("crab"))
                        {
                            crab();
                        } 
                     else if(select1.equals("dam paarai")) 
                         {
                               dampaarai();
                         }
                     else if(select1.equals("cutla"))
                         {
                               cutla();
                         }
                      else if(select1.equals("maththi"))
                         {
                              maththi();
                         }
                       else if(select1.equals("rohu"))
                            {
                                  rohu();
                             }
                       else if(select1.equals("salmon"))
                            {
                                 salmon();
                            }
                       else
                            {
                                 System.out.println("Please select a food from this list");
                                 seafoods();
                            }
                       }catch(Exception u){}
                 }
         public void crab()
                 {
                   try
                     {
                     DataInputStream in4 = new DataInputStream(System.in);
                     System.out.println("Add items to cart ");
                     int crab = 550;
                     System.out.println("Select how much crab you want ");
                     double userwant = Double.valueOf(in4.readLine()).doubleValue();
                     double totalcrab = userwant*crab;
                     System.out.println(totalcrab);
                    // totalfoods[0]={totalcrab};
                     seafoods();
                     }catch(Exception k){}
                 }
          public void dampaarai()
                 {
                   try
                     {
                     DataInputStream in5 = new DataInputStream(System.in);
                     int dampaarai = 250;
                     System.out.println("Select how much dampaarai you want ");
                     double userwant = Double.valueOf(in5.readLine()).doubleValue();
                     double totaldampaarai = userwant*dampaarai;
                     System.out.println(totaldampaarai);
                     seafoods();
                     }catch(Exception d){}
                  }
          public void cutla()
                   {
                   try
                     {
                     DataInputStream in6 = new DataInputStream(System.in);
                     int cutla = 260;
                     System.out.println("Select how much cutla you want ");
                     double userwant = Double.valueOf(in6.readLine()).doubleValue();
                     double totalcutla = userwant*cutla;
                     System.out.println(totalcutla);
                     seafoods();
                     }catch(Exception d){}
                   }
          public void maththi()
                    {
                       try
                     {
                     DataInputStream in7 = new DataInputStream(System.in);
                     int maththi = 320;
                     System.out.println("Select how much maththi you want ");
                     double userwant = Double.valueOf(in7.readLine()).doubleValue();
                     double totalmaththi = userwant*maththi;
                     System.out.println(totalmaththi);
                     seafoods();
                     }catch(Exception d){}
                    }
           public void rohu()
                    {
                        try
                     {
                     DataInputStream in8 = new DataInputStream(System.in);
                     int rohu = 250;
                     System.out.println("Select how much rohu you want ");
                     double userwant = Double.valueOf(in8.readLine()).doubleValue();
                     double totalrohu = userwant*rohu;
                     System.out.println(totalrohu);
                     seafoods();
                     }catch(Exception d){}
                     }
           public void salmon()
                  {
                       try
                     {
                     DataInputStream in9 = new DataInputStream(System.in);
                     int salmon = 680;
                     System.out.println("Select how much salmon you want ");
                     double userwant = Double.valueOf(in9.readLine()).doubleValue();
                     double totalsalmon = userwant*salmon;
                     System.out.println(totalsalmon);
                     seafoods();
                     }catch(Exception d){}
                   }  
           public void mutton()
                 {
                   try
                     {
                     DataInputStream in10 = new DataInputStream(System.in);
                     System.out.println("Orders you needs");
                    System.out.println("You want mutton  ..yes/no");
                    String permi = in10.readLine();
                         if(permi.equals("yes"))
                             {
                                  System.out.println("we have more new products for you");
                              }
                          else
                               {
                                    categories();   
                               }
                     String[] mutton ={"normalmutton","liver","blood","brain","thalakari"};
                     for(int k=0;k<=4;k++)
                        { 
                           System.out.print(mutton[k]+"  ");
                         }System.out.println();
                     System.out.println("select a food what do you want");
                     String select2 = in10.readLine();
                     if(select2.equals(mutton[0]))
                        {
                              normalmutton();
                        }
                     else if(select2.equals(mutton[1]))
                         {
                               liver();
                          }
                      else if(select2.equals(mutton[2]))
                          {
                              blood();
                           }
                       else if(select2.equals(mutton[3]))
                           {
                                brain();
                           }
                       else if(select2.equals(mutton[4]))
                           {
                                 thalakari();
                           }
                       else
                           {
                                System.out.println("please select food from this list");
                                mutton();
                           }
                      }catch(Exception k){}
                  }

            public void normalmutton()
                   {
                       try
                        {
                        DataInputStream in11 = new DataInputStream(System.in);
                        double normalmutton =760;
                        System.out.println("Select how much normal mutton you need ");
                        double userwant = Double.valueOf(in11.readLine()).doubleValue(); 
                        double totalmutton = userwant*normalmutton;
                        System.out.println(totalmutton);
                        mutton();
                         }catch(Exception i){}
                    }
              public void liver()
                    {
                        try
                          {
                          DataInputStream in12 = new DataInputStream(System.in);
                          double liver = 760;
                          System.out.println("Select how much liver you need ");
                          double userwant = Double.valueOf(in12.readLine()).doubleValue();
                          double totalliver = userwant*liver;
                          System.out.println(totalliver);
                          mutton();
                           }catch(Exception m){}
                      }
                 public void blood()
                       {
                         try
                          {
                          DataInputStream in13 = new DataInputStream(System.in);
                          double blood = 100;
                          System.out.println("Select how much blood you need ");
                          double userwant = Double.valueOf(in13.readLine()).doubleValue();
                          double totalblood = userwant*blood;
                          System.out.println(totalblood);
                          mutton();
                           }catch(Exception m){}
                       }
                 public void brain()
                       {
                         try
                          {
                          DataInputStream in14 = new DataInputStream(System.in);
                          double brain = 120;
                          System.out.println("Select how much brain you need ");
                          double userwant = Double.valueOf(in14.readLine()).doubleValue();
                          double totalbrain = userwant*brain;
                          System.out.println(totalbrain);
                          mutton();
                           }catch(Exception m){}
                       } 
                 public void thalakari()
                       {
                         try
                          {
                          DataInputStream in15 = new DataInputStream(System.in);
                          double thalakari = 500;
                          System.out.println("Select how much thalakari you need ");
                          double userwant = Double.valueOf(in15.readLine()).doubleValue();
                          double totalthalakari = userwant*thalakari;
                          System.out.println(totalthalakari);
                          mutton();
                           }catch(Exception m){}
                       }
           public void chicken()
                 {
                    try
                      {
                      DataInputStream in16 = new DataInputStream(System.in);
                      System.out.println("orders you need ");
                       System.out.println("You want chicken  ..yes/no");
                    String permi = in16.readLine();
                         if(permi.equals("yes"))
                             {
                                  System.out.println("we have more new products for you");
                              }
                          else
                               {
                                    categories();   
                               }
                      String[] chicken ={"normalchicken","broilerchicken","legpiece","boneless"};
                      for(int l=0;l<=3;l++)
                       {
                           System.out.print(chicken[l]+"  ");
                        }System.out.println();
                    System.out.println("Select a food what do you want");
                    String select3  = in16.readLine(); 
                    if(select3.equals("normalchicken"))
                        {
                            normalchicken();
                        } 
                     else if(select3.equals("broilerchicken")) 
                         {
                              broilerchicken();
                         }
                     else if(select3.equals("legpiece"))
                         {
                               legpiece();
                         }
                      else if(select3.equals("boneless"))
                         {
                              boneless();
                         }
                       else
                            {
                                 System.out.println("Please select a food from this list");
                                 chicken();
                            }
                       }catch(Exception u){}
                 }

          public void normalchicken()
                    {
                        try
                          {
                          DataInputStream in17 = new DataInputStream(System.in);
                          double normalchicken = 610;
                          System.out.println("Select how much normalchicken you need ");
                          double userwant = Double.valueOf(in17.readLine()).doubleValue();
                          double totalnormal = userwant*normalchicken;
                          System.out.println(totalnormal);
                          chicken();
                           }catch(Exception m){}
                      }
                 public void broilerchicken()
                       {
                         try
                          {
                          DataInputStream in18 = new DataInputStream(System.in);
                          double broilerchicken = 210;
                          System.out.println("Select how much broilerchicken you need ");
                          double userwant = Double.valueOf(in18.readLine()).doubleValue();
                          double totalbroiler = userwant*broilerchicken;
                          System.out.println(totalbroiler);
                          chicken();
                           }catch(Exception m){}
                       }
                 public void legpiece()
                       {
                         try
                          {
                          DataInputStream in19 = new DataInputStream(System.in);
                          double legpiece = 210;
                          System.out.println("Select how much legpiece you need ");
                          double userwant = Double.valueOf(in19.readLine()).doubleValue();
                          double totalleg = userwant*legpiece;
                          System.out.println(totalleg);
                          chicken();
                           }catch(Exception m){}
                       } 
                 public void boneless()
                       {
                         try
                          {
                          DataInputStream in20 = new DataInputStream(System.in);
                          double boneless = 320;
                          System.out.println("Select how much boneless you need ");
                          double userwant = Double.valueOf(in20.readLine()).doubleValue();
                          double totalless = userwant*boneless;
                          System.out.println(totalless);
                          chicken();
                           }catch(Exception m){}
                       }
           public void egg()
                  {  
                     try
                       {
                       DataInputStream in21 =new DataInputStream(System.in);
                       System.out.println("orders you need");
                        System.out.println("You want eggs  ..yes/no");
                    String permi = in21.readLine();
                         if(permi.equals("yes"))
                             {
                                  System.out.println("we have more new products for you");
                              }
                          else
                               {
                                    categories();   
                               }
                       String[] egg = {"normalegg","broileregg"};
                        for(int l=0;l<=1;l++)
                       {
                           System.out.print(egg[l]+"  ");
                        }System.out.println();
                       System.out.println("Select a food what do you want");
                       String select4  = in21.readLine(); 
                       if(select4.equals("normalegg"))
                           { 
                                normalegg();   
                            }
                        else if(select4.equals("broileregg"))
                             {
                                    broileregg(); 
                              }
                         else
                              {
                                     System.out.println("Please select correct food from the list");
                                     egg();
                               }
                             }catch(Exception n){}
                     }
                         public void normalegg()
                              {
                                   try
                                    {
                                     DataInputStream in22 =new DataInputStream(System.in);
                                     int normalegg = 15;
                                     System.out.println("select how much normal eggs you need");
                                     int userwant = Integer.valueOf(in22.readLine()).intValue();
                                     int totalnormal = userwant*normalegg;
                                     System.out.println(totalnormal);
                                     egg();
                                     }catch(Exception u){}
                               }
                           public void broileregg()
                               {
                                   try
                                     {
                                     DataInputStream in23 = new DataInputStream(System.in);
                                     int broileregg = 7;
                                     System.out.println("select how much broiler eggs you need");
                                     int userwant = Integer.valueOf(in23.readLine()).intValue();
                                     int totalbroiler = userwant*broileregg;
                                     System.out.println(totalbroiler);
                                     egg();
                                    }catch(Exception w){}
                                }
                           public void exit()
                                { 
                                     
                                      System.out.println("Thanks for using chikau");
                                      System.exit(0);
                                }
                      
                                                            
                           
                  }

class chikau
    {
        public static void main(String[] args)
           {
                  one obj1 = new one();
                  obj1.welcome();
           }
     }