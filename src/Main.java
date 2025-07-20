import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk tam ədəd: ");
        int a = input.nextInt();

        System.out.print("İkinci tam ədəd: ");
        int b = input.nextInt();

        System.out.print("Üçüncü tam ədəd: ");
        int c = input.nextInt();

        System.out.print("İlk onluq ədəd: ");
        double x = input.nextDouble();

        System.out.print("İkinci onluq ədəd: ");
        double y = input.nextDouble();

        System.out.println("İki tam ədədin hasili: " + Vurma.multiply(a, b));
        System.out.println("Üç tam ədədin hasili: " + Vurma.multiply(a, b, c));
        System.out.println("İki onluq ədədin hasili: " + Vurma.multiply(x, y));

        input.close();
    }
}
