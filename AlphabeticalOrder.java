import java.util.*;

public class AlphabeticalOrder {
    public static void main(String[] args) {
    
        String[] names = {
            "Zara", "John", "Alice", "Bob", "Eve", "Charlie", "David", "Grace", "Hannah", "Frank"
        };

        System.out.println("Names before sorting:");
        for (String name : names) {
            System.out.println(name);
        }
        
        Arrays.sort(names);
        
        System.out.println("\nNames after sorting:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
   