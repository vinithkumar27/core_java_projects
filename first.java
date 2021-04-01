import java.util.Scanner;
class one
    {
        public void trone()
               {
                     Scanner in = new Scanner(System.in);
                     System.out.println("Enter the input value to reverse");
                     int n = in.nextInt();
                     int a,b,c,d;
                     a=n/1000;
                     n=n%1000;
                     b=n/100;
                     n=n%100;
                     c=n/10;
                     n=n%10;
                     d=n;
                        System.out.println(d+""+c+""+b+""+a);
               }
   }


class first
    {
         public static void main(String[] args)
                  {
                        one obj1 = new one();
                        obj1.trone();
                  }
    }