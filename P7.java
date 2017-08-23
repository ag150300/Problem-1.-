import java.util.Scanner;

public class P7{
    public static void main(String argus[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("輸入C:");
        int C = scn.nextInt();
        int F = 0;
        F = C*9/5+32;
        System.out.println(F);
    }
}