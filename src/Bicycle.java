public class Bicycle extends Vehicle {
    @Override
    public void move() {
        System.out.println("Velosiped");
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Bicycle();

        v1.move();
        v2.move();
    }
}
