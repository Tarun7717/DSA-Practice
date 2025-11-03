import java.io.IOException;
import java.util.Scanner;

public class reverse {

    public static void main(String[] args) throws IOException {
        int mul = 0,
            rem = 0;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 0) {
            rem = num % 10;
            mul = (mul * 10) + rem;
            num = num / 10;
        }
        System.out.println(mul);
        sc.close();
    }
}
