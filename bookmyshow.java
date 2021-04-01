import java.io.DataInputStream;
class book
   {
        int firstclass=150,secondclass=120,min=1,max=36;
        long number;
        DataInputStream in1 = new DataInputStream(System.in);
       public void book(long number)
            {
              try
                {
                 System.out.println("Continue with mobile number & Enter");
                 number = Long.parseLong(in1.readLine());
                 System.out.println("+91 "+number);
                 this.number=number;
               }catch(Exception p){}
             }
        public void profiledata()
            {
                try
                  {
                   System.out.println("First Name");
                   String firstname = in1.readLine();
                   System.out.println("Last Name");
                   String lastname = in1.readLine();
                   String fullname=firstname+lastname; 
                   System.out.println(fullname);
                   System.out.println("Mobile Number "+number);
                   System.out.println("Gender\n   Male/Female");
                   String gender = in1.readLine();
                   System.out.println("Birthday");
                   calender();
                   System.out.println("Married?   Yes/No");
                   String status = in1.readLine();
                   mainpage();
                   }catch(Exception r){}  
             }
        public void calender()
             {
                try 
                  {
                 System.out.println("Enter your birth year    1999,1998,....");
                 int year = Integer.parseInt(in1.readLine());
                 System.out.println("Enter your birth month   jan,feb,mar....");
                 String month = in1.readLine();
                 System.out.println("Enter your birth date   1,2,3...."); 
                 int date = Integer.parseInt(in1.readLine());
                 System.out.println(date+"/"+month+"/"+year);
                  }catch(Exception i){}
              }
       public void mainpage()
              {
                try
                 {
                  System.out.println("Now Showing");
                  String[] generes = {"Tamil","Hindi","Telugu","Malayalam"};
                  for(int i=0;i<4;i++)
                    {
                         System.out.print("  "+generes[i]);
                    }
                  System.out.println();
                  String language = in1.readLine();
                  if(language.equalsIgnoreCase(generes[0]))
                    {
                         tamilmovies(); 
                     }
                  else if(language.equals(generes[1]))
                     {
                          hindimovies();
                     }
                  else if(language.equals(generes[2]))
                     {
                          telugumovies();
                     }
                  else if(language.equals(generes[3]))
                      {
                           malayalammovies();
                       }
                  else
                        {
                             System.out.println("Please enter same as display");
                             mainpage();
                         }}catch(Exception e){}
                   }

            public void tamilmovies()
                {
                  try
                    {
                    String[] trendmovies={"Nenjam Marappathillai[0]","Thaen[1]","Sema Thimiru[2]"};
                     for(int i=0;i<3;i++)
                        {
                               System.out.print(trendmovies[i]);
                        }
                    System.out.println();
                    int selecttamil=Integer.parseInt(in1.readLine());
                    if(selecttamil == 0)
                         {
                    System.out.println("rating 70%\n  2D   TAMIL  \n     2h 30m   *   Horror,Thriller   *  UA   *5Mar,2021");
                    String[][] castcrew ={{"S.J.Surya","Regina Cassandra","Nandita Swetha","K.Selvaraghavan","Gautham Menon","Yuvan Shankar Raja","Arvind Krishna","Prasanna GK"},{"Actor","Actress","Actress","Director  Writer  Screenplay","Producer","Musician","Cinemotographer","Editor"}};
                   for(int i=0;i<2;i++)
                       {
                          for(int j=0;j<1;j++)
                             {
                                   System.out.print(castcrew[i][j]+"            ");
                             }
                       }
                    System.out.println();
                    for(int i=0;i<2;i++)
                        {
                            for(int j=1;j<2;j++)
                              {
                                     System.out.print(castcrew[i][j]+"     ");
                              }  
                          } System.out.println();
                      for(int i=0;i<2;i++)
                          {
                               for(int j=2;j<3;j++)
                                   {
                                        System.out.print(castcrew[i][j]+"       ");
                                    }
                          }System.out.println();
                       for(int i=0;i<2;i++)
                           {
                                for(int j=3;j<4;j++)
                                    {
                                           System.out.print(castcrew[i][j]+"      ");       
                                     }
                             }System.out.println();
                       for(int i=0;i<2;i++)
                           {
                                for(int j=4;j<5;j++)
                                    {
                                           System.out.print(castcrew[i][j]+"        ");       
                                     }
                             }System.out.println();
                        for(int i=0;i<2;i++)
                           {
                                for(int j=5;j<6;j++)
                                    {
                                           System.out.print(castcrew[i][j]+"   ");       
                                     }
                             }System.out.println();
                        for(int i=0;i<2;i++)
                           {
                                for(int j=6;j<7;j++)
                                    {
                                           System.out.print(castcrew[i][j]+"       ");       
                                     }
                             }System.out.println();
                       for(int i=0;i<2;i++)
                           {
                                for(int j=7;j<8;j++)
                                    {
                                           System.out.print(castcrew[i][j]+"          ");       
                                     }
                             }System.out.println();
                        String[] booktickets ={"Book tickets[0]","back[1]"};
                        for(int i=0;i<2;i++)
                            {
                                System.out.println(booktickets[i]);
                            }
                        int book = Integer.parseInt(in1.readLine());
                        if(book == 0)
                             {
                                   seats();
                             }
                        else
                             {
                                    System.out.println("ok i back");
                                    tamilmovies();
                             }
                       }
         else if(selecttamil == 1)
                        {
                    System.out.println("rating 70%\n  2D   TAMIL  \n     1h 44m   *   Drama,Romantic   *  U   *19 Mar,2021");
                    String[][] castcrew ={{"Aruldoss","Bava Lakshmanan","Tharun Kumar","Abarnathi","Ganesh","rahul","Sukumar","Lawrence Kishore"},{"Actor","Actor","Actor","Actress","Director  Writer","producer","Cinemotographer","Editor"}};
                   for(int i=0;i<2;i++)
                       {
                          for(int j=0;j<1;j++)
                             {
                                   System.out.print(castcrew[i][j]+"            ");
                             }
                       }
                    System.out.println();
                    for(int i=0;i<2;i++)
                        {
                            for(int j=1;j<2;j++)
                              {
                                     System.out.print(castcrew[i][j]+"     ");
                              }  
                          } System.out.println();
                      for(int i=0;i<2;i++)
                          {
                               for(int j=2;j<3;j++)
                                   {
                                        System.out.print(castcrew[i][j]+"        ");
                                    }
                          }System.out.println();
                       for(int i=0;i<2;i++)
                           {
                                for(int j=3;j<4;j++)
                                    {
                                           System.out.print(castcrew[i][j]+"           ");       
                                     }
                             }System.out.println();
                       for(int i=0;i<2;i++)
                           {
                                for(int j=4;j<5;j++)
                                    {
                                           System.out.print(castcrew[i][j]+"              ");       
                                     }
                             }System.out.println();
                        for(int i=0;i<2;i++)
                           {
                                for(int j=5;j<6;j++)
                                    {
                                           System.out.print(castcrew[i][j]+"               ");       
                                     }
                             }System.out.println();
                        for(int i=0;i<2;i++)
                           {
                                for(int j=6;j<7;j++)
                                    {
                                           System.out.print(castcrew[i][j]+"             ");       
                                     }
                             }System.out.println();
                       for(int i=0;i<2;i++)
                           {
                                for(int j=7;j<8;j++)
                                    {
                                           System.out.print(castcrew[i][j]+"    ");       
                                     }
                             }System.out.println();
                        String[] booktickets ={"Book tickets[0]","back[1]"};
                        for(int i=0;i<2;i++)
                            {
                                System.out.println(booktickets[i]);
                            }
                        int book = Integer.parseInt(in1.readLine());
                        if(book == 0)
                             {
                                   seats();
                             }
                        else
                             {
                                    System.out.println("ok i back");
                                    tamilmovies();
                             }
                          }
                     else if(selecttamil == 2)
                       {
                    System.out.println("rating 71%\n  2D   TAMIL  \n     2h 40m   *   Action,Drama,Thriller   *  UA   *19 Feb,2021");
                    String[][] castcrew ={{"Dhruva Sarja","Rahmika Mandanna","Rajkumar","Nanda Kishore","B.K. Gangadhar","Chandan Shetty","Arjun janya"},{"Actor","Actress","Actor","Director  Writer  Screenplay","Producer","Singer","Musician"}};
                   for(int i=0;i<2;i++)
                       {
                          for(int j=0;j<1;j++)
                             {
                                   System.out.print(castcrew[i][j]+"          ");
                             }
                       }
                    System.out.println();
                    for(int i=0;i<2;i++)
                        {
                            for(int j=1;j<2;j++)
                              {
                                     System.out.print(castcrew[i][j]+"      ");
                              }  
                          } System.out.println();
                      for(int i=0;i<2;i++)
                          {
                               for(int j=2;j<3;j++)
                                   {
                                        System.out.print(castcrew[i][j]+"              ");
                                    }
                          }System.out.println();
                       for(int i=0;i<2;i++)
                           {
                                for(int j=3;j<4;j++)
                                    {
                                           System.out.print(castcrew[i][j]+"         ");       
                                     }
                             }System.out.println();
                       for(int i=0;i<2;i++)
                           {
                                for(int j=4;j<5;j++)
                                    {
                                           System.out.print(castcrew[i][j]+"        ");       
                                     }
                             }System.out.println();
                        for(int i=0;i<2;i++)
                           {
                                for(int j=5;j<6;j++)
                                    {
                                           System.out.print(castcrew[i][j]+"        ");       
                                     }
                             }System.out.println();
                        for(int i=0;i<2;i++)
                           {
                                for(int j=6;j<7;j++)
                                    {
                                           System.out.print(castcrew[i][j]+"           ");       
                                     }
                             }System.out.println();
                        String[] booktickets ={"Book tickets[0]","back[1]"};
                        for(int i=0;i<2;i++)
                            {
                                System.out.println(booktickets[i]);
                            }
                        int book = Integer.parseInt(in1.readLine());
                        if(book == 0)
                             {
                                   seats();
                             }
                        else
                             {
                                    System.out.println("ok i back");
                                    tamilmovies();
                             }
                           }
                       else
                          {
                                   System.out.println("Sorry we are not available");
                                   System.exit(0);
                           }
                     }catch(Exception o){}
                }

             public void seats()
                 {
                   try
                     {
                     System.out.println("seats for today");
                     System.out.println("Tamil  *  2D\n");
                     String[] theater = {"ARRS Multiplex [0]","INOX:Reliance Mall [1]","Kailash Prakash [2]"};
                     for(int i=0;i<3;i++)
                       {
                            System.out.print(theater[i]);
                       }
                     System.out.println();
                     int theater1 = Integer.parseInt(in1.readLine());
                     switch(theater1)
                       {
                           case 0:
                                    System.out.println("Welcome to ARRS Multiplex");
                                    String[] show ={"11:10 AM  [0]","02:40 PM  [1]"};
                                    for(int i=0;i<2;i++)
                                       {
                                                   System.out.print(show[i]+"   ");
                                        }
                                    String showno = (in1.readLine());
                          if(showno.equals("0"))
                                {
                                          System.out.println("Terms & Conditions\nPlease read these important terms and conditions for the internet booking\n 1.Drunken people are not allowed on the premises\n 2.Outside food is not allowed on the premises\n 3.Smoking is not allowed on the premises");
                                    String[] access = {"cancel [0]","Accept [1]"};
                                    for(int i=0;i<2;i++)
                                       {
                                             System.out.println(access[i]);
                                       }
                                 }
                           else if(showno.equals("1"))
                                {
                                          System.out.println("Terms & Conditions\nPlease read these important terms and conditions for the internet booking\n 1.Drunken people are not allowed on the premises\n 2.Outside food is not allowed on the premises\n 3.Smoking is not allowed on the premises");
                                    String[] access1 = {"cancel [0]","Accept [1]"};
                                    for(int i=0;i<2;i++)
                                       {
                                             System.out.println(access1[i]);
                                       }
                                 }
                              else
                                 {
                                           System.out.println("Sorry we have only two shows");
                                           seats();
                                 }
                               int access2 =Integer.parseInt(in1.readLine());
                                    if(access2==0)
                                       {
                                            seats();
                                        }
                                     else
                                          {
                                                numbers();
                                           }
                                      break;
                      case 1:
                                       System.out.println("Welcome to INOX Theater");
                                    String[] show1 ={"11:10 AM  [0]","02:40 PM  [1]"};
                                    for(int i=0;i<2;i++)
                                       {
                                                   System.out.print(show1[i]+"   ");
                                        }
                                    int showno1 = Integer.parseInt(in1.readLine());
                                    if(showno1 == 0)
                                      {
                                          System.out.println("Terms & Conditions\nPlease read these important terms and conditions for the internet booking\n 1.Drunken people are not allowed on the premises\n 2.Outside food is not allowed on the premises\n 3.Smoking is not allowed on the premises");
                                    String[] access3 = {"cancel [0]","Accept [1]"};
                                    for(int i=0;i<2;i++)
                                       {
                                             System.out.println(access3[i]);
                                       }
                                       }
                                    else if(showno1 == 1)
                                         {
                                               System.out.println("Terms & Conditions\nPlease read these important terms and conditions for the internet booking\n 1.Drunken people are not allowed on the premises\n 2.Outside food is not allowed on the premises\n 3.Smoking is not allowed on the premises");
                                    String[] access4 = {"cancel [0]","Accept [1]"};
                                    for(int i=0;i<2;i++)
                                       {
                                             System.out.println(access4[i]);
                                       }
                                         }
                                     else
                                         {
                                                 System.out.println("Sorry sir , we have only two shows");
                                                 seats();
                                          }
                                    int access5 =Integer.parseInt(in1.readLine());
                                    if(access5==0)
                                       {
                                            seats();
                                        }
                                     else
                                          {
                                                numbers();
                                           }
                                      break;
                     case 2:
                                    System.out.println("Welcome to Kailash Prakash");
                                    String[] show2 ={"11:10 AM  [0]","02:40 PM  [1]"};
                                    for(int i=0;i<2;i++)
                                       {
                                                   System.out.print(show2[i]+"   ");
                                        }
                                    int showno2 = Integer.parseInt(in1.readLine());
                                    if(showno2 == 0)
                                      {
                                          System.out.println("Terms & Conditions\nPlease read these important terms and conditions for the internet booking\n 1.Drunken people are not allowed on the premises\n 2.Outside food is not allowed on the premises\n 3.Smoking is not allowed on the premises");
                                    String[] access6 = {"cancel [0]","Accept [1]"};
                                    for(int i=0;i<2;i++)
                                       {
                                             System.out.println(access6[i]);
                                       }
                                       }
                                    else if(showno2 == 1)
                                      {
                                          System.out.println("Terms & Conditions\nPlease read these important terms and conditions for the internet booking\n 1.Drunken people are not allowed on the premises\n 2.Outside food is not allowed on the premises\n 3.Smoking is not allowed on the premises");
                                    String[] access7 = {"cancel [0]","Accept [1]"};
                                    for(int i=0;i<2;i++)
                                       {
                                             System.out.println(access7[i]);
                                       }
                                         }
                                    else
                                        {
                                                System.out.println("Sorry we have only two shows");
                                               seats();
                                         }
                                    int access8 =Integer.parseInt(in1.readLine());
                                    if(access8==0)
                                       {
                                            seats();
                                        }
                                     else
                                          {
                                                numbers();
                                           }
                                      break;
                      default:
                                      System.out.println("Sorry we are unavailable");
                                      System.exit(0);
                           }}catch(Exception z){}
                      }
             
             public void numbers()
                  { 
                     try
                      {
                       System.out.println("FIRST CLASS "+firstclass);
                       System.out.println("SECOND CLASS "+secondclass);
                       System.out.println("How many seats? 1 2 3 4 5 6 7 8 9 10");
                       int noseats = Integer.parseInt(in1.readLine());
                       System.out.println("Select a class first[0]/second[1]");
                       int section = Integer.parseInt(in1.readLine());
                       switch(section) 
                          {
                          case 0:
                                     System.out.println("Select a row  from A-J");
                                     String firstrow = in1.readLine();
                                            System.out.println("Your Seats are...");
                                            int randomseat =(int)(Math.random()*(max-min+1)+min);
                                            int i = randomseat;
                                            System.out.println(randomseat);
                                            for(i=randomseat;i<i+noseats;noseats--)
                                              {
                                                   System.out.print("    "+i+""+firstrow);
                                                   i++;
                                              }
                                            System.out.println();
                                            System.out.println("Come in to theater before 30 minutes\n     Thankyou");
                                       break;
                          case 1:
                                     System.out.println("Select a row  from K-R");
                                     String secondrow = in1.readLine();
                                            System.out.println("Your Seats are...");
                                            int randomseat1 =(int)(Math.random()*(max-min+1)+min);
                                            System.out.println(randomseat1);
                                            int j=randomseat1;
                                              for(j=randomseat1;j<j+noseats;noseats--)
                                              {
                                                   System.out.print("    "+j+""+secondrow);
                                                   j++;
                                              }
                                            System.out.println();
                                            System.out.println("Come in to theater before 30 minutes\n     Thankyou");
                                       break;
                             default:
                                       System.out.println("Choose a given row only");
                                       break;
                                 }
                          }catch(Exception p){}
                    }                       
                       
                       
             public void hindimovies()
                 {
                           System.out.println("Sorry hindimovies are not played in salem");
                  }
              public void malayalammovies()
                   {
                           System.out.println("Sorry malayalam movies are not played in salem");
                    }
               public void telugumovies()
                    {
                           System.out.println("Sorry telugu movies are not played in salem");
                    }
    }


 class logo extends book
   {      
        DataInputStream in = new DataInputStream(System.in);
        logo()
            {
                  String text = "    BookMyShow\nIt All Starts Here";
                  for(int i = 0; i < text.length(); i++)
                      {
                          System.out.printf("%c", text.charAt(i));
                          try{
                              Thread.sleep(200);//0.2s pause between characters
                               }catch(InterruptedException ex)
                              {
                               Thread.currentThread().interrupt();
                              }
                        }System.out.println();
                        languages();
                 }
        
        public void languages()
            {
               try
                 {
                 System.out.println("Explore In Your Own Language");
                 String[] languages = {"english","hindi","Tamil","Telugu","Malayalam","Marathi","Kannada"};
                 for(int i=0;i<=6;i++)
                    {
                         System.out.print("   "+languages[i]);
                    }
                 System.out.println();
                 System.out.println("Select your prefered Language");
                 String language = in.readLine();
                 if(language.equals("english"))
                     {
                            System.out.println("LET'S GET STARTED");
                            login();
                     }             
                  else 
                     {
                             System.out.println("i know only english please click english ");
                             languages();
                     }
                   }catch(Exception y){}                           
               }
          public void login()
               {
                     String text = "Enjoy faster show booking through our recommendations tailored for you\n   Now save money on your movie ticketes with free discount coupons from restaurants & cafes\n      Forgot to grab your movie snacks?No worries!you can still order them even after booking your tickets ";
                    for(int i = 0; i < text.length(); i++)
                      {
                          System.out.printf("%c", text.charAt(i));
                          try{
                              Thread.sleep(50);//0.2s pause between characters
                               }catch(InterruptedException ex)
                              {
                               Thread.currentThread().interrupt();
                              }
                        }mobilenumber(number);
                  }   

          public void mobilenumber(long number)
                 {
                     try
                       {
                       System.out.println();
                       book(number);
                       System.out.println("I agree to the Terms & Conditions and Privacy Policy");
                        OTP();
                       }catch(Exception i){}
                 }
                       
           public void OTP()
                 {
                     try  
                       {
                       System.out.println("Verify your phone number\n\n   VERIFY YOUR NUMBER");
                       System.out.println("Enter OTP sent to "+number);
                       int otp = Integer.parseInt(in.readLine());
                       if(otp==123456)
                           {
                             Region();
                            }
                       else
                            {
                                System.out.println("Please enter correct OTP & we sent again to "+number);
                                mobilenumber(number);
                            }
                           }catch(Exception p){}
                    }

            public void Region()
                  {
                     try  
                       {
                        System.out.println("To continue,turn on device location,\nwhich uses Google's location\nservice");
                        System.out.println("nothanks & ok");
                        String want1 = in.readLine();
                        if(want1.equals("ok"))
                            {
                                     mobileaccess();
                            }
                        else if(want1.equals("nothanks"))
                            {
                               System.out.println("Sorry,you only can access this app by location access..");
                               System.exit(0);
                            }
                         else
                            {
                                System.out.println("Please enter only nothanks or ok");
                             }
                           }catch(Exception k){}
                   }
                   
              public void mobileaccess()
                   {
                        try
                          {
                           System.out.println("Allow BookMyShow to access\nthis device's location?");
                           String[] allow ={"ALLOW ALL THE TIME  [0]","ALLOW ONLY WHILE USING THE APP  [1]","DENY  [2]"};
                            for(int i=0;i<3;i++)
                              {
                                    System.out.println(allow[i]);
                              }
                            int allows = Integer.parseInt(in.readLine());
                            switch(allows)
                              {
                                  case 0:
                                             System.out.println("Detecting Location......");
                                             System.out.println("We find your Location from Salem\n  if it is correct press yes else no");
                                             String allowsr = in.readLine();
                                             if(allowsr.equals("yes"))
                                                {
                                                    profiledata();
                                                 }
                                             else
                                                  { 
                                                       System.out.println("Check your location again ..");
                                                       mobileaccess();
                                                   }
                                             break;
                                  case 1:
                                             System.out.println("Detecting Location......");
                                             System.out.println("We find your Location from Salem\n  if it is correct press yes else no");
                                             String allowsr1 = in.readLine();
                                             if(allowsr1.equals("yes"))
                                                {
                                                    profiledata();
                                                 }
                                             else
                                                  { 
                                                       System.out.println("Check your location again ..");
                                                       mobileaccess();
                                                   }
                                             break; 
                                  case 2:
                                            System.out.println("Sorry,you only can access this app by location access..");
                                            System.exit(0);
                                 default:
                                            System.out.println("Click form listed below"); 
                                            mobileaccess();
                                  }
                               }catch(Exception o){}
                   }
    }

class bookmyshow
   {
        public static void main(String[] args) 
            {
                    logo obj = new logo();
            }
    }