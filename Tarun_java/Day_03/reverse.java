package Tarun_java.Day_03;
import java.util.*;

public class reverse {
    public static void main(String[] args){
        int num,rem=0,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();

        while(num > 0)
        {
            rem=num % 10;
            rev=(rev * 10) + rem;
            num= num/10;
        }

        System.out.println("Reversed string is:"+rev);

    }
    


    
}
