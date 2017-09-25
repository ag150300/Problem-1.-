import java.util.Scanner;

public class P44{
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        for (int i = 2; i <= a; i++) {
            if(i == 2){
                System.out.print("2"+"    ");
            }
            if(i == 5){
                System.out.print("5"+"    ");
            }
            if (i % 2 != 0 && i % 5 != 0 && i % 3 != 0){
                System.out.print(i+"    ");
            }
        }
    }
}