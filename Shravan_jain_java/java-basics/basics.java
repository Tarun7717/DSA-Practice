import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class basics {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //printing hello world
        System.out.println("hello world");
        //reading input from the user
        System.out.println("Enter the number:");
        int val = sc.nextInt();
        System.out.println("You Entered:" + val);
        //data types and variables
        int age = 72;
        System.out.println("The age of the person is:" + age);
        float height = 184.5f;
        System.out.println("The height of the person is" + height);
        double pi_value = 3.1422882828;
        System.out.println("The value of the pi:" + pi_value);
        char hold_character = 'h';
        System.out.println("The character:" + hold_character);
        boolean b1 = true;
        boolean b2 = false;
        // if else condition
        if (age < 18) System.out.println("Not eligible to drive");
        else System.out.println("Eligible to drive");
        // for loop
        for (int i = 0; i < 10; i++) System.out.println(i);
        sc.close();
    }
}
