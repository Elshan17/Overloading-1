public class Olcu {
    public static double convert(int cm) {
        return cm / 100.0;
    }
    public static double convert(double kg) {
        return kg * 1000;
    }
    public static float convert(String celsius) {
        return Float.parseFloat(celsius);
    }
}
