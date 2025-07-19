import java.util.Scanner;
public class shop {
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in); 
      System.out.println("Select option (e.g = a,b,c)"); 
      System.out.println("\n a: Veg \n b: Nonvneg \n c:Stators");
      
      String menue = input.nextLine();
      switch (menue) {
        case "a" :
        System.out.println("""
          Veg items \n 
          Item                    \tPrice   \tQuantity(in grams) 
          --------------------------------------------------------
          Paneer fried rice        \t100     \t200
          Paneer butter masala      \t150     \t200
          Paneer tikka               \t200     \t200
         North Indian meals           \t180     \t450 
          """);
        
        case "b":
        System.out.println("""
           non Veg items \n 
          Item                  \tPrice      \tQuantity(in grams) 
          ---------------------------------------------------------
          Chiken fried rice      \t100         \t200
          Chiken butter masala    \t150         \t200
          Chiken tikka              \t200        \t200
          Chiken Manchurian          \t100        \t200
          """);
          
         case "c" : 
         System.out.println("""
                 Stators
                 ---------------------------------------
                 Items \t Price \tQuantity(in grams)
                 Gobi \t 120 \t 450
                 Bonda \t 10 \t 3(piece's)
                 Paneer \t 30 \t 250
                 """);
       break;
        default:
            System.out.println("Nothing go to second floor");
        
        break;
    }
    int amount = bill();
    System.out.println("Your total amount is " + amount);   
}

    static int bill() {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter the price of item1: ");
        int bill = 0;
        ;
        while   (true) {
         System.out.println("Enter the price of item ( enter 0 to stop)");
        int price = input.nextInt();
            if (price == 0){
                break;
            }
             System.out.println("Enter the quantity of item: ");
            int quantity = input.nextInt();

            bill += price * quantity;
        }
        
        
        return bill;

    }

      }
