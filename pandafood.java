import java.util.Scanner;
class one
    {
        int i=0;
        String username,order,order1,order2;
        public void login()
            {
               Scanner in = new Scanner(System.in);
               System.out.println("Enter your name please");
               String username = in.nextLine();
               System.out.println("Hi "+username);
               System.out.println("Welcome to pandafood");
               this.username=username;
               usertype();            
            }  

        public void usertype()
            {
               Scanner in = new Scanner(System.in);
               System.out.println("you are a existing user or new user ..exist/new");
               String usertype = in.nextLine();
               if(usertype.equals("exist"))
                  {
                    userID();
                  }
                else
                   {
                         System.out.println("Register your details in foodpanda register");
                         newregister();
                    }
             }
        public void newregister()
             {
                 Scanner in = new Scanner(System.in);
                 System.out.println("Hi "+username+" we are a family right now ");
                 System.out.println("Enter your contact number :");
                 String number = in.nextLine();
                 System.out.println("Enter your age :");
                 int age = in.nextInt();
                 System.out.println("Enter your address please : ");
                 String address = in.nextLine();
                 System.out.println("create your userID : ");
                 String userID = in.nextLine();
                 System.out.println("create your password : ");
                 String password = in.nextLine();
                 System.out.println("Thankyou "+username+" you can order foods in foodpanda right now");
                 userID();
              }                 

        public void userID()
            {
               Scanner in = new Scanner(System.in);
               System.out.println("Enter your userID ");
               String userID = in.nextLine();
               if((userID.equals("helloworld")) || (userID.equals("helloearth")))
                 {
                     password();
                  }
               else
                  {
                     System.out.println("please enter correct userID");
                     userID();
                  }
              }
 
        public void password()
            {
               Scanner in = new Scanner(System.in);
               System.out.println("Enter your password ");
               String password = in.nextLine();
               if((password.equals("1234")) || (password.equals("5678")))
                 {
                     System.out.println("Welcome to foodpanda world .."+username);
                     menu();
                  }
               else if(i<2)
                  {
                      System.out.println("please enter correct password ");
                      i++;
                      password();
                   }
                else
                   {
                        System.out.println("Sorry your account is closed temperorly");
                   }
               }      

        public void menu()
             {
                Scanner in = new Scanner(System.in);
                System.out.println("hi "+username+" choose your food type...breakfast#lunch#dinner");
                String food = in.nextLine();
                if(food.equals("breakfast"))
                   {
                       breakfast();
                   }
                else if(food.equals("lunch"))
                   {
                         lunch();
                   } 
                else if(food.equals("dinner"))
                   {
                           dinner();
                    }
               else
                    { 
                          System.out.println("please tell me the order please");
                          menu();
                     }
              }   

        public void breakfast() 
             {
                 Scanner in = new Scanner(System.in);
                 System.out.println("pick your liked breakfast from the list ..idly(1),poori(2),pongal(3)");
                 int breakfast = in.nextInt();
                 this.order=order;
                 switch(breakfast)
                      {
                          case 1 :
                                    order = "idly"; 
                                    break;
                          case 2 :
                                    order = "poori";
                                    break;
                          case 3:
                                    order = "pongal";
                                    break;
                          default:
                                   order = "Normal water";
                       }
                           System.out.println(order);
                           next();           
               }   
  
         public void next()
                {
                           Scanner in = new Scanner(System.in);
                           System.out.println("can i take next order please...yes#no");
                           String nextorder = in.nextLine();
                           if(nextorder.equals("yes"))
                                {
                                     breakfast();
                                }
                           else 
                                {
                                    bill();
                                }         
                }

         public void lunch()
               {
                     Scanner in = new Scanner(System.in);
                     System.out.println("pick you like lunch from the list ...full meal(1),half meal(2),briyani(3)");
                     int lunch = in.nextInt();
                     this.order1=order1;
                     switch(lunch)
                             {
                                  case 1:
                                               order1 = "full meal";
                                               break;
                                  case 2:
                                               order1 = "half meal";
                                                break;
                                   case 3:
                                                order1 = "briyani";
                                                break;
                                   default:
                                               order1 = "don't want lunch";
                               }
                                   System.out.println(order1);
                                   nextlunch();
                  }     

             public void nextlunch()
                {
                           Scanner in = new Scanner(System.in);
                           System.out.println("can i take next order please...yes#no");
                           String nextorder1 = in.nextLine();
                           if(nextorder1.equals("yes"))
                                {
                                     lunch();
                                }
                           else 
                                {
                                      bill();
                                }          
                }

             public void dinner()
                  {
                        Scanner in = new Scanner(System.in);
                        System.out.println("pick you like dinner from the list ...noodles(1),non(2),buttermasala(3)");
                        int dinner = in.nextInt();
                        this.order2=order2;
                        switch(dinner)
                            {
                               case 1 :
                                         order2 = "noodles"; 
                                         break;
                               case 2 :
                                          order2 = "non";
                                          break;
                                case 3:
                                           order2 = "buttermasala";
                                           break;
                                default:
                                            order2 = "don't want dinner";
                            }
                               System.out.println(order2);  
                               nextdinner();
                     }   

         public void nextdinner()
                {
                       Scanner in = new Scanner(System.in);
                       System.out.println("can i take next order please...yes#no");
                       String nextorder2 = in.nextLine();
                       if(nextorder2.equals("yes"))
                          {
                             dinner();
                           }
                       else
                           {
                              bill();
                           }           
                }
                  
          public void bill()
                {
                         System.out.println("your orders are ");
                         System.out.println("1. "+order);
                         System.out.println("2. "+order1);
                         System.out.println("3. "+order2);
                         System.out.println("Thankyou so much "+username+" we will sent a order within few minutes");
                  }
                              
     }                                                           
 
class pandafood
    {
         public static void main(String[] args)
            {
                  one obj1 = new one();
                  obj1.login();
             }
     }