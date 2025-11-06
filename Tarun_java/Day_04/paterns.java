//Program to create a Solid rectangle pattern

package Tarun_java.Day_04;
import java.util.*;;

public class paterns {
    public static void main(String[] args){
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        n=sc.nextInt();

        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
    }
}
