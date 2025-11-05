import java.io.IOException;
import java.util.Scanner;

public class recursionIn {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //printing the given number using recursion
        int val = sendNumber(5);
        System.out.println(val);
        System.out.println("Enter the factorial number");
        int fact = sc.nextInt();
        int factTotal = factorial(fact);
        System.out.println(factTotal);
        sc.close();
    }

    public static int sendNumber(int n) {
        if (n == 0) return 1;
        System.out.println(n);
        return sendNumber(n - 1);
    }
    // printing the factorial of a given number
    public static int factorial(int f) {
        if (f == 0) return 1; //as i understood this is used to remove the function from the call stack to ensure that it doesnt overflow the stack 
        return f*factorial(f-1);
    }
}
