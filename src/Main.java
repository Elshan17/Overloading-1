import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InfoPrinter printer = new InfoPrinter();
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        String university;

        System.out.print("Adı daxil edin: ");
        name = scanner.nextLine();
        printer.printInfo(name);

        System.out.print("Adı daxil edin: ");
        name = scanner.nextLine();
        System.out.print("Yaşı daxil edin: ");
        age = scanner.nextInt();
        scanner.nextLine();
        printer.printInfo(name, age);

        System.out.print("Adı daxil edin: ");
        name = scanner.nextLine();
        System.out.print("Yaşı daxil edin: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Universiteti daxil edin: ");
        university = scanner.nextLine();
        printer.printInfo(name, age, university);

        scanner.close();
    }
}
