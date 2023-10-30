import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("____________________________");
        
        System.out.println("Set ==>> new HashSet<>() interface...");
        System.out.println("----------------------------");

        Set<String> hash_set = new HashSet<>();
        hash_set.add("Hello");
        hash_set.add(" ");
        hash_set.add("World");
        hash_set.add("!.");

        System.out.println(hash_set);

        System.out.println("----------------------------");

        for (String item : hash_set) {
            System.out.println("For loop item is: " + item);
        }
        System.out.println("----------------------------");

        hash_set.forEach(item -> {
            System.out.println("For each item is: " + item);
        });
        System.out.println("----------------------------");

        System.out.println("Is empty: " + hash_set.isEmpty());        

        System.out.println("Size: " + hash_set.size());        
        
        System.out.println("Contains 'Hello': " + hash_set.contains("Hello"));
        System.out.println("Contains 'hello': " + hash_set.contains("hello"));
        
        System.out.println("Contains 'World': " + hash_set.contains("World"));
        System.out.println("Contains 'world': " + hash_set.contains("world"));

        System.out.println("----------------------------");
        System.out.println("____________________________");

    }
}
