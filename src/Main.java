public class Main {
    public static void main(String[] args) {

        InfoPrinter printer = new InfoPrinter();

        printer.printInfo();
        printer.printInfo("Elsen");
        printer.printInfo("Elsen", 28);
        printer.printInfo("Elsen", 28, "Bakı");
    }
}
