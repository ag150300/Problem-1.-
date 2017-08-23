import java.util.Scanner;
import java.util.Random;
public class P3 {
    public static void main ( String args[] ) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        Random ran = new Random();
        ran.setSeed(a);
        int[] line = new int[6];
        for(int i =0;i <6;i++){
            line[i] = ran.nextInt(42)+1;
            System.out.print(line[i]+"        ");
        }
    }
}