import java.util.*;

public class DivisibilityRelation {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the divisibility relation number D: ");
        int D = kb.nextInt();
        
        ArrayList<Integer> arraydiv = new ArrayList<>();

        for (int i = 1; i <= D; i++) {
            if (D % i == 0) {
                arraydiv.add(i);
            }
        }

        System.out.println(arraydiv);
    }
}
