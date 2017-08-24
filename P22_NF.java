import java.util.Scanner;

public class P22_NF {

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(gcd(n,m));
    }
    public static int gcd(int a,int b){
        if(b == 0){
            return 0;
        }
        else {
            int t = 0;
                while(b !=0) {
                    t = a % b;
                    a = b;
                    b = t;
                }
            return a ;
        }
    }
}