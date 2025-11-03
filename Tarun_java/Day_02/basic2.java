import java.util.*;
public class basic2 {
    public static void main(String[] args)
    {
        int age;
        
        //To take user input
        Scanner sc=new Scanner(System.in);

        //Taking a input from the user
        System.out.println("Enter the Age:");
        age=sc.nextInt();

        System.out.println("The number is :"+age);

        //Using if-else loop
        if(age >= 18)
        {
            System.out.println("You are an Adult");
        }else{
            System.out.println("You are a Minor");
        }

        sc.close();    
    }
}
