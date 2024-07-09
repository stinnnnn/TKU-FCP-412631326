import java.util.Scanner;
public class hm_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("第一件商品的價格：");
        double item1 = scanner.nextDouble();       
        System.out.print("第二件商品的價格：");
        double item2 = scanner.nextDouble();       
        System.out.print("第三件商品的價格：");
        double item3 = scanner.nextDouble(); 
        double total = item1 + item2 + item3;
        System.out.println("購物總價：" + total);
        scanner.close();
    }
}

    

