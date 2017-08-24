import java.util.Scanner;

public class P15{
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int t = 0;
        if(m < n){
            t=m;
            m=n;
            n=t;
        }
        System.out.println(gcd(m)/(gcd(n)*gcd(m-n)));
    }
    public static int gcd(int a){
        int b = 1;
for(int i = 1;i <=a;i++){
    b=b*i;
}
        return b;
    }
}