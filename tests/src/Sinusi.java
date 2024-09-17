public class Sinusi {
    public static void main(String[] args) {
        double s = 0;
        for (double i = 0.1; i <= 2.05; i = i + 0.1) {
            s = s + Math.sin(i);
        }
        System.out.printf("%.4f", s);
    }
}
