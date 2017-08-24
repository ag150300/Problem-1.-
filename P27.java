import java.util.Scanner;

public class P27{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        double b;

        if(a < 600){
            b=a*0.5;
            System.out.println(b);
        }
        if(a>=600 && a<=1200){
            b=a*0.9*0.5;
            System.out.println(b);
        }
        if(a > 1200){
            b =a*0.79*0.5;
            System.out.println(b);
        }
    }
}