import java.util.Scanner;

public class P37{
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        for (int i = 0; i < a; i++) {
            for (int s = a ; s > i; s--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
                for (int m = 0; m <i;m++) {
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}