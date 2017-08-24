import java.util.Scanner;

public class P25{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = 0;
        double a = Math.pow(x,3);
        double b = Math.pow(x,2);
        if(x > 1){
        y = 2*x+3;
        System.out.println(y);
        }
        if(-1<=x && x<= 1){
            double Y = Integer.valueOf(y);
        Y = a+3*x-3;
        int i;
            i = (int)Math.pow(Y, 1);
            System.out.println(i);
        }
        if(x < -1){
            double Y = Integer.valueOf(y);
            Y = 3*b;
            int i;
            i = (int)Math.pow(Y, 1);
            System.out.println(i);
        }
    }
}