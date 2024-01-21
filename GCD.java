import java.util.*;

public class GCD {
    public static void main(String[] args) {
        
        System.out.println("Enter 1st and 2nd values for which you wish to find the greatest common divisor: ");
        
        Scanner kb = new Scanner(System.in);
        int val1 = kb.nextInt();

        Scanner kd = new Scanner(System.in);
        int val2 = kd.nextInt();

        int gcd = 1; 

        // GCD calculation where val2 > val1
        if (val1 < val2) { 
            int mod, div_even;
            
            
            do {
                mod = val2 % val1;
                div_even = (val2 - mod) / val1;
                val2 = val1;
                val1 = mod;
            } while (mod != 0);

            gcd = val2;
        }
        
        // GCD calculation where val1 > val2
        if (val1 > val2) { 
            int mod, div_even;
            
            
            do {
                mod = val1 % val2;
                div_even = (val1 - mod) / val2;
                val1 = val2;
                val2 = mod;
            } while (mod != 0);

            gcd = val1;
        }
        
        System.out.println("GCD: " + gcd);
    }
}
