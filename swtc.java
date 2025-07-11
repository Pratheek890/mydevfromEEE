import java.util.Scanner;
public class swtc {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
  

        
        while(true){
            System.out.print("Enter your favourite batsman jersey number: ");
        int Crick = in.nextInt();
        
        switch (Crick){

            case 45 -> System.out.println("""
        Rohit Sharma
        📊 Career Batting — Formats Comparison
        Format\tMatches\tRuns\'Avg\'100 s/50 s\tTop Score
        Test\t67\t4,301\t40.57\t12/18\t212
        ODI\t273\t11,168\t48.76\t32/58\t264
        T20I\t159\t4,231\t32.05\t5/32\t121*
        """);

    case 77 -> System.out.println("""
        Shubman Gill
        📊 Career Batting — Formats Comparison
        Format\tMatches\tRuns\'Avg\'100 s/50 s\tTop Score
        Test\t34\t2,478\t42.72\t8/7\t269
        ODI\t55\t2,775\t59.04\t8/15\t208
        T20I\t21\t578\t30.42\t1/3\t126*
        """);

    case 18 -> System.out.println("""
        Virat Kohli
        📊 Career Batting — Formats Comparison
        Format\tMatches\tRuns\tAvg\t100's/50's\tTop Score
        Test\t123\t9,230\t46.85\t30/31\t254*
        ODI\t302\t14,181\t57.88\t51/74\t183
        T20I\t125\t4,188\t48.69\t1/38\t122*
        """);

    case 1 -> System.out.println("""
        K L Rahul
        📊 Career Batting — Formats Comparison
        Format\tMatches\tRuns\tAvg\t100's/50's\tTop Score
        Test\t60\t3,493\t34.58\t9/18\t199
        ODI\t85\t3,043\t49.08\t7/18\t112
        T20I\t72\t2,265\t37.75\t2/22\t110*
        """);

    case 10 -> System.out.println("""
        Sachin Tendulkar
        📊 Career Batting — Formats Comparison
        Format\tMatches\tRuns\tAvg\t100's/50's\tTop Score
        Test\t200\t15,921\t53.78\t51/68\t248*
        ODI\t463\t18,426\t44.83\t49/96\t200*
        """);

    case 7 -> System.out.println("""
        MS Dhoni
        📊 Career Batting — Formats Comparison
        Format\tMatches\tRuns\tAvg\t50 s/100 s\tTop Score
        Test\t90\t4,876\t38.09\t6/33\t224
        ODI\t350\t10,773\t50.57\t10/73\t183
        T20I\t98\t1,617\t37.60\t0/2\t84*
        """);

    case 8 -> System.out.println("""
        Ravindra Jadeja
        📊 Career Batting — Formats Comparison
        Format\tMatches\tRuns\tAvg\t50s\tTop Score
        Test\t82\t1,222\t35.41\t13\t87
        ODI\t204\t1,371\t35‑36\t13\t87
        T20I\t74\t515\t21.45\t0\t46*
        """);

    case 25 -> System.out.println("""
        Cheteshwar Pujara
        📊 Career Batting — Formats Comparison
        Format\tMatches\tRuns\'Avg\'100 s/50 s\tTop Score
        Test\t103\t7,195\t44.00\t?/?\t206*
        """);

    case 27 -> System.out.println("""
        Ajinkya Rahane
        📊 Career Batting — Formats Comparison
        Format\tMatches\tRuns\'Avg\'100 s/50 s\tTop Score
        Test\t85\t5,077\t38.46\t12/26\t188
        ODI\t90\t2,962\t35.26\t3/24\t111
        T20I\t20\t375\t20.83\t0/1\t61
        """);
    case 17 -> System.out.println("""
        Rishabh Pant
        📊 Career Batting — Formats Comparison  
        Format\tMatches\tRuns\'Avg\'100 s/50 s\tTop Score
        Test\t36\t2,271\t43.50\t5/11\t159
        ODI\t30\t1,206\t34.46\t3/6\t125
        T20I\t66\t1,205\t23.10\t0/6\t
        78
        """);                    

    case 33 -> System.out.println("""
        Hardik Pandya
        Career Batting - formats comparison
        Format\tmatches\truns\tAvg\t100's/50's\ttop score
        Test\t11\t532\t31.29\t1/2\t108
        ODI\t80\t1,732\t45.89\t3/9\t140     
        T20I\t92\t1,606\t29.63\t0/8\t79*
        """);

          
            

   

            


            default -> { System.out.println("no data found"); 
            return;  
        }

            

            
        }















        }














    }
}

