public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee m1 = new Manager();

        System.out.println("İşçinin maaşı: " + e1.calculateSalary());
        System.out.println("Menecerin maaşı: " + m1.calculateSalary());
    }
}

