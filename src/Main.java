import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Santimetr daxil et: ");
        int cm = input.nextInt();
        System.out.println("Metrlə: " + Olcu.convert(cm));
        System.out.print("Kiloqram daxil et: ");
        double kg = input.nextDouble();
        System.out.println("Qramla: " + Olcu.convert(kg));
        input.nextLine();
        System.out.print("Temperaturu (string olaraq) daxil et: ");
        String tempStr = input.nextLine();
        System.out.println("Float kimi: " + Olcu.convert(tempStr));
        input.close();
    }
}
