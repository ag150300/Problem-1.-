import java.util.Scanner;

public class P43{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 1;
        int b= 1;
        int c =0;
        System.out.print("1"+"    ");
        while(a < n){
            a=a+b;
            b++;
            System.out.print(a+"    ");
        }
        System.out.println();
        for(int i =1;i <= a;i++){
            c++;
            for(int j = 1;j<=i;j++){
                System.out.print(c+"    ");
            }
        }
        System.out.println();
    }
}