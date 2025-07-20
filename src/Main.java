import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kvadratın tərəfini daxil et: ");
        int side = input.nextInt();
        System.out.println("Kvadratın sahəsi: " + FiqurSaheleri.area(side));

        System.out.print("Düzbucaqlının uzunluğunu daxil et: ");
        int length = input.nextInt();
        System.out.print("Düzbucaqlının enini daxil et: ");
        int width = input.nextInt();
        System.out.println("Düzbucaqlının sahəsi: " + FiqurSaheleri.area(length, width));

        System.out.print("Dairənin radiusunu daxil et: ");
        double radius = input.nextDouble();
        System.out.println("Dairənin sahəsi: " + FiqurSaheleri.area(radius));

        input.close();
    }
}
