import java.util.Scanner;

public class P32{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = 2*n - 1;
        int j = 1;
        double d ;
        double sum = 0;

        for(int i = 0;i <n;i++){
           d=1d/(j*(j+1));
           sum = sum +d;
           j=j+2;
        }
        System.out.println(sum);
    }
}