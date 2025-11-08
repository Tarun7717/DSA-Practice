package Tarun_java.Day_05;
import java.util.*;
public class ihpRotated {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j,k,m,n;
        System.out.println("Enter the number of rows and columns:");
        m=sc.nextInt();
        n=sc.nextInt();

        //outer loop to print rows
        for(i=1;i<=m;i++){

            //Inner loop to print spaces
            for(j=1;j<=n-i;j++){
                System.out.print("  ");
             }

             //Inner loop to print *
            for(k=1;k<=i;k++){
                System.out.print("* ");
            } 
            System.out.println();
        }
        sc.close();
    }
    
}
