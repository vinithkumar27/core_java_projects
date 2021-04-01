import mypackages.welcome;
class one extends welcome
   {
      one()
          {
                System.out.println("I am robot"); 
           }               
    }
 
class rohit extends one
     {
         rohit()
             {
                    super();
                    System.out.println("Hi vini");
              }
      }

class first
   {
        public static void main(String[] args)
            {
                 welcome obj2 = new welcome();
                 rohit obj = new rohit();  
                 //obj.blue("vinith",23);  

            }
    }