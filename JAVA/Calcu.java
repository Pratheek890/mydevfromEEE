import java.util.Scanner;
public class Calcu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans= 0;
        while(true){
        System.out.println("Enter the operator ");
         char op=input.next().trim().charAt(0);
        if ( op == '+' || op == '-' || op == '*' || op == '/' || op =='%') {
            System.out.println("Enter the  numbers: ");
            int a = input.nextInt();
            int b = input.nextInt();
            if(op == '+'){
                System.out.println("you have selected addition");
                ans = a + b;
            }
            if(op == '-'){
                ans = a - b;
            }
            if(op == '*'){
                ans = a * b;
            }
            if(op == '/'){
                if (a!= 0 && b!=0){
                    ans = a/b;
                }
             }    
            if(op == '%'){
                ans = a % b;       
            }
        
            } else if (op == 'x' || op == 'X'){
                System.out.println("Exiting the calculator.");
                break;
        }    
            else {
                System.out.println("Invalid operator");
           
        }
    

        System.out.println("the answer of " + ans);
}
}

}

// thank you so much