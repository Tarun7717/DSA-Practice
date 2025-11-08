package Tarun_java.Day_05;
import java.util.*;
public class InvertedHP {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j,m,n;
        System.out.println("Enter the number of rows and columns:");
        m=sc.nextInt();
        n=sc.nextInt();

        for(i=m;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
