import mypackages.input;
class one extends input
    {
         one()
             { 
                 System.out.println("Hello vinith");
             }   
    }

class second 
    {
          public static void main(String[] args)
              {
                    one obj1=new one();
                    obj1.getdata();
              }
    }