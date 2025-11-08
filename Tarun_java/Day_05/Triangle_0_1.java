package Tarun_java.Day_05;
import java.util.*;;

public class Triangle_0_1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int i,j,m,n;
        System.out.println("Enter the number of rows :");
        m=sc.nextInt();
       

        for(i=1;i<=m;i++){
            for(j=1;j<=i;j++){
                if((i+j)%2==0){ //even
                    System.out.print("1 ");
                }else{ //odd
                    System.out.print("0 ");
                }
                
            }
            System.out.println();
        }
        sc.close();

    }
}
