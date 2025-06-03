import java.util.Scanner;  // Scanner 클래스 import

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner 객체 생성

        
        String x = scanner.nextLine();        
        int s = scanner.nextInt();
        System.out.print(x.charAt(s-1));
    }
}
