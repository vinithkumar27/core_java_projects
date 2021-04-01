import java.util.Scanner;
class one 
     {
          one()
              {
                    Scanner in = new Scanner(System.in);
                    System.out.println("Enter your age please");
                    int age = in.nextInt();
                    System.out.println("Enter your sex M/F");
                    char sex = in.next().charAt(0);
                    System.out.println("Enter your marital status Y/N");
                    char status = in.next().charAt(0);
 
                       if(sex=='F')
                            {
                                 System.out.println("She will work only in urban areas");
                            }
                       if(sex=='M')
                             {
                                  if((20>=age)&&(age<=40))
                                          {
                                              System.out.println("He works anywhere");
                                          }
                                  else if((age>=40)&&(age<=60))
                                         {
                                               System.out.println("he will work at urban areas");
                                          }
                                    else 
                                         {
                                                System.out.println("Error");
                                          }
}}}
                             

class fifth
    {
         public static void main(String[] args)
                {
                     one ghf = new one();
                 }
    }