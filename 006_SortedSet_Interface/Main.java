import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("____________________________");

        System.out.println("SortedSet ==>> new TreeSet<>() interface...");
        System.out.println("----------------------------");

        SortedSet<Car> sorted_set = new TreeSet<>(Comparator.comparing(Car::getName));

        Car car1 = new Car("Toyota", 3);
        Car car2 = new Car("Kia", 4);
        Car car3 = new Car("Changan", 5);

        sorted_set.add(car1);
        sorted_set.add(car2);
        sorted_set.add(car3);

        System.out.println(sorted_set);

        System.out.println("----------------------------");

        for (Car item : sorted_set) {
            System.out.println("For loop item is: " + item.getName());
        }
        System.out.println("----------------------------");

        sorted_set.forEach(item -> {
            System.out.println("For each item is: " + item.getName());
        });
        System.out.println("----------------------------");

        System.out.println("Is empty: " + sorted_set.isEmpty());

        System.out.println("Size: " + sorted_set.size());

        System.out.println("Contains 'car1': " + sorted_set.contains(car1));
        System.out.println("Contains 'car2': " + sorted_set.contains(car2));

        System.out.println("Contains 'car3': " + sorted_set.contains(car3));
        System.out.println("Contains 'new Car(\"test\", 1)': " + sorted_set.contains(new Car("test", 1)));

        System.out.println("----------------------------");
        System.out.println("____________________________");

    }
}
