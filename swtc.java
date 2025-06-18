import java.util.Scanner;
public class swtc {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
  

        
        while(true){
            System.out.print("Enter your favourite batsman jersey number: ");
        int Crick = in.nextInt();
        
        switch (Crick){

            case 45 -> System.out.println("Rohit Sharma");
            case 77 -> System.out.println("Shubman Gill");
            case 18 -> System.out.println("Virat Kohli");
            case 1 -> System.out.println("K L Rahul");
            case 10 -> System.out.println("Sachin Tendulkar");
            case 7 -> System.out.println("MS Dhoni");
            case 8 -> System.out.println("Ravindra Jadeja");
            case 25 -> System.out.println("Cheteshwar Pujara");
            case 27 -> System.out.println("Ajinkya Rahane");
            case 33 -> System.out.println("Hardik Pandya");
            case 32 -> System.out.println("Ishan Kishan");        
            case 41 -> System.out.println("Shreyas Iyer");
            case 63 -> System.out.println("Suryakumar Yadav");
            case 20 -> System.out.println("Axar Patel");


            default -> { System.out.println("no data found"); 
            return;  
        }

            

            
        }















        }














    }
    
}
