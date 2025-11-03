import java.io.IOException;
import java.util.Scanner;

public class prime {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = 0,
            flag = 0;
        System.out.println("Enter the number:");
        num = sc.nextInt();
        if (num == 1 || num == 2) flag = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = 0;
                break;
            } else flag = 1;
        }
        if (flag == 1) System.out.println("The number is price");
        else System.out.println("the number is not a prime");
        sc.close();
    }
}
