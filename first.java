import java.util.*;
import java.math.*;

public class FibonacciHuge {
    public static int getFibonacciHuge (long n, long m) {
        long arr[] = new long [(int)n+1];
        int k=0;
        if(n>1)
        {
            arr[0] = 0;
            arr[1] = 1;
            for ( long i =2; i<n+1; i++){
                
                arr[(int) i] = arr[(int)i-1] + arr[(int)i-2] ;
                
                if ( (arr[(int)i])% m == 1 & (arr[(int)i-1])% m == 0)
                {
                   
                    k = (int) i-1;       
                    System.out.println(k);
                    break;       
                } 
            } 
            
            return ((int) arr[(int)n % k]);
        }

        else if(n==0 )
        {
            //System.out.println(0);
            return 0;
        }
        else
        {
            //System.out.println(1);
            return 1;
        }   
    }   
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        scanner.close();
        System.out.println(FibonacciHuge.getFibonacciHuge(n, m));
    }
}

