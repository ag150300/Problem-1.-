import java.util.Scanner;

public class P14{
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c= scn.nextInt();
        int d = 0;
        int e = a*b*c;
        if(b > a){
            d=a;
            a=b;
            b=d;
        }
        int t = 0;
        while(b!=0){
        t=a%b;
        a=b;
        b=t;
        }
        t = 0;
        while(c!=0){
            t=a%c;
            a=c;
            c=t;
        }
        System.out.println(e/a/a);
    }
}