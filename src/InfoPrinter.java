    public class InfoPrinter {

    // 1. Parametrsiz
    public void printInfo() {
        System.out.println("Məlumat yoxdur");
    }

    // 2. Ad verilir
    public void printInfo(String ad) {
        System.out.println("Ad: " + ad);
    }

    // 3. Ad və yaş verilir
    public void printInfo(String ad, int yas) {
        System.out.println("Ad: " + ad + ", Yaş: " + yas);
    }

    // 4. Ad, yaş və şəhər verilir
    public void printInfo(String ad, int yas, String seher) {
        System.out.println("Ad: " + ad + ", Yaş: " + yas + ", Şəhər: " + seher);
    }
}
