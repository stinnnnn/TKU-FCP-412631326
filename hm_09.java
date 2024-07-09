import java.util.Scanner;
public class hm_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("長度：");
        double length = scanner.nextDouble();        
        System.out.print("寬度：");
        double width = scanner.nextDouble();        
        double area = length * width;        
        System.out.println("面積：" + area);
        scanner.close();
    }
}
