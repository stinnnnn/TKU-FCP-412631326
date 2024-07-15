import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入攝氏溫度: ");
        int celsius = scanner.nextInt();
        
        int fahrenheit = (int) (celsius * 9.0 / 5.0 + 32);
        
        System.out.println(fahrenheit);
        
        scanner.close();
    }
}

