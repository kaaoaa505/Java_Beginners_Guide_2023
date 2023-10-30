import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("list interface...");
        System.out.println("----------------------------");

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add(" ");
        list.add("World");
        list.add("!.");

        System.out.println(list);
        System.out.println("----------------------------");

        System.out.println(list.get(0) + list.get(1) + list.get(2) + list.get(3));
        System.out.println("----------------------------");

        for (String item : list) {
            System.out.println("For loop item is: " + item);
        }
        System.out.println("----------------------------");

        list.forEach(item -> {
            System.out.println("For each item is: " + item);
        });
        System.out.println("----------------------------");
        System.out.println("____________________________");

    }
}
