import java.util.Scanner;

public class Con2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        if ((A % 2 == 0 || B % 2 == 0) && (A % 3 == 0 && B % 3 == 0 && C % 3 == 0)) {
            System.out.println("Истина");
        } else System.out.println("Ложь");
    }
}