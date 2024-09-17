
import java.util.Scanner;

public class Videja {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        double s = 0, videjais, x;
        int skaits = 0;
        for (int i = 1; i <= 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print(i + ". atzime: ");
            try {
                x = sc.nextDouble();
            } catch (Exception e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                break;
            }
            if (x >= 0) {
                s = s + x;
                skaits++;
            }
        }
        videjais = s / 10;
        System.out.println( "Videja atzime ir " + videjais );
        System.out.println("Pozitivi skaitli ir " + skaits);

    }
}
