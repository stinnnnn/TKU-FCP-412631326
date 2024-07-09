import java.util.Scanner;

public class hm_07 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);

        System.out.print("半徑: ");
        double radius = scanner.nextDouble();

        double area = PI * radius * radius;
        System.out.println("面積: " + area);

        scanner.close();
    }
}