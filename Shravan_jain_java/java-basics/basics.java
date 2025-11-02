import java.io.IOException;
import java.util.Scanner;

public class basics {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //printing hello world
        System.out.println("hello world");
        //reading input from the user
        System.out.println("Enter the number:");
        int val = sc.nextInt();
        System.out.println("You Entered:" + val);
        sc.close();
    }
}
