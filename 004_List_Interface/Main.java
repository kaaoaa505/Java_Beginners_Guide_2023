import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("____________________________");
        
        System.out.println("List ==>> new ArrayList<>() interface...");
        System.out.println("----------------------------");

        List<String> array_list = new ArrayList<>();
        array_list.add("Hello");
        array_list.add(" ");
        array_list.add("World");
        array_list.add("!.");

        System.out.println(array_list);
        System.out.println("----------------------------");

        System.out.println(array_list.get(0) + array_list.get(1) + array_list.get(2) + array_list.get(3));
        System.out.println("----------------------------");

        for (String item : array_list) {
            System.out.println("For loop item is: " + item);
        }
        System.out.println("----------------------------");

        array_list.forEach(item -> {
            System.out.println("For each item is: " + item);
        });
        System.out.println("----------------------------");
        System.out.println("____________________________");

    }
}
