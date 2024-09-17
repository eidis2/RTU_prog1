// 000rdb000 Jānis Programmētājs

import java.util.Scanner;

class Maja {
  public static void main(String[] args) {
    double x, y;
    try (Scanner sc = new Scanner(System.in)) {
      x = sc.nextDouble();
      y = sc.nextDouble();
      boolean red = (x >= 3 && x <= 7 && y >= 3 && y < 7) != (x > 4 && x < 6 && y > 4 && y < 6),
          blue = (y >= 7 && y <= x + 5 && y <= -x + 15),
          green = ((x - 5) * (x - 5)) + ((y - 8) * (y - 8)) < 1 && y > 8;
      if (green) {
        System.out.println("green");
      } else if (blue) {
        System.out.println("blue");
      } else if (red) {
        System.out.println("red");
      } else {
        System.out.println("white");
      }
      sc.close();
    } catch (Exception e) {
      System.out.println("input-output error");
    }
  }
}