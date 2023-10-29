public class Car {
    private String name;
    private int doors;

    public Car(String name, int doors) {
        setName(name);
        setDoors(doors);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

}
