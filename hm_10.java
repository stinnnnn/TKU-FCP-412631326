import java.util.Scanner;
public class hm_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("華氏溫度：");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("攝氏溫度：" + celsius);
        scanner.close();
    }
}
