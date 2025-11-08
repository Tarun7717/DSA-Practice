package Tarun_java.Day_05;
import java.util.*;

public class hollowRect {
    public static void main(String[] args){
        int i,j,m,n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows and columns:");
        m=sc.nextInt();
        n=sc.nextInt();

        for(i=1;i<=m;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==1 || j==1 || i==m || j==n )
                {
                    System.out.print("* ");
                }else{
                     System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
