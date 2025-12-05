package Tarun_java.Day_06;
import java.util.*;

public class palindrome{
    
    public static void main(String[] args){
        int x,temp,digit;
        ArrayList<Integer> pal_num=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number:");
        x=sc.nextInt();
        temp=x;
        while(x != 0){
            digit=x%10;
            pal_num.add(digit);
            x=x/10;
        }
        if(temp == pal_num){
            System.out.println("The number is palindrome\n");
        }
        else{
            System.out.println("The number is not a palindrome\n");
        }
         

    }    
}