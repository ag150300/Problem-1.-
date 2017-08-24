import java.util.Scanner;

public class P33{
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a= 1;
        double sum = 0;
        int b = 0;
        for(int i = 0;i < n;i++){
            double d = Math.pow(2,a);
            a++;
            sum =sum+d;
           b = (int)sum;
        }
        System.out.println(b);
    }
}