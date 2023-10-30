import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("____________________________");

        System.out.println("Queue ==>> new LinkedList<>() interface...");
        System.out.println("----------------------------");

        Queue<String> linked_list = new LinkedList<>();
        linked_list.add("Hello");
        linked_list.add(" ");
        linked_list.add("World");
        linked_list.add("!.");

        System.out.println(linked_list);
        System.out.println("----------------------------");

        for (String item : linked_list) {
            System.out.println("For loop item is: " + item);
        }
        System.out.println("----------------------------");

        linked_list.forEach(item -> {
            System.out.println("For each item is: " + item);
        });
        System.out.println("----------------------------");
        
        System.out.println(linked_list.peek());
        System.out.println(linked_list.peek());
        System.out.println("----------------------------");

        System.out.println(linked_list.poll());
        System.out.println(linked_list.poll());
        System.out.println(linked_list.poll());
        System.out.println(linked_list.poll());

        System.out.println(linked_list.poll());
        System.out.println(linked_list.poll());

        System.out.println("----------------------------");
        System.out.println("____________________________");

    }
}
