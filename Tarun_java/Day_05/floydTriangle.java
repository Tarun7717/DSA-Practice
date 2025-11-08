package Tarun_java.Day_05;
import java.util.*;;

public class floydTriangle {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter the number of rows :");
        n=sc.nextInt();
        int num=1;
        

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        sc.close();

    }
}
