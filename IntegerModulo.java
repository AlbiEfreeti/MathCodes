//algorithm, given the modulo integers of Zx, find where a given value n is in that modulo with respect to how Zx functions. 
import java.util.*;

public class IntegerModulo {

    // Create a separate static method to check if a number is present in the array
    public static boolean isNumberInArray(int number, int[] arrayZ) {
        for (int i = 0; i < arrayZ.length; i++) {
            if (number == arrayZ[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        int element_arr = 0;

        System.out.println("Give a number that represents the index of Z: ");
        Scanner kb = new Scanner(System.in);
        int length = kb.nextInt();

        // create an array that represents 0 - (length-1), modulo of length
        int[] arrayZ = new int[length];
        for (int i = 0; i < length; i++) {
            arrayZ[i] = i;
        }
        System.out.println(Arrays.toString(arrayZ));

        // now the number we are looking for in the modulo
        System.out.println("Give the number you want to search in Z: ");
        Scanner kd = new Scanner(System.in);
        int number = kd.nextInt();

        // check if the number is already in the array
        if (isNumberInArray(number, arrayZ)) {
            System.out.println("Zx: " + number);
        } else {
            // algorithm to find Zx and convert it to an element that can be found in arrayZ
            for(int i= 0; number > length; i++){
                element_arr = number - length;
                number = element_arr;
                } // Zx representation of the number
            System.out.println("The Zx representation of your number is: " + number);
        }
    }
}




       



