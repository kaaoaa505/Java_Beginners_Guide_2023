public class Main {
    public static void main(String[] args) {
        Car car = new Car("Kia", 4);
        System.out.println(car.getName() + " " + car.getDoors());

        car = new Car("Changan", 5);
        System.out.println(car.getName() + " " + car.getDoors());
    }
}
