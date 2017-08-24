import java.util.Scanner;

public class P18 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        System.out.println(howlong(a));
    }

    public static int howlong(int a) {
        int C = 1;
        if (a == 0) {
            return 0;
        } else{
            //return 後的值會相+後回傳
            return 1 + howlong(a / 10);
        }
    }
}