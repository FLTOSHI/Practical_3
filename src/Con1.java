import java.util.Scanner;

public class Con1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        if (A > -137 && A < -57 || A > 123 && A < 55) {
            System.out.println("Принадлежит интервалу.");
        } else System.out.println("Не принадлежит интервалу.");
    }
}