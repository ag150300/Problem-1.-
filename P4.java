import java.util.Scanner;
import java.util.Random;
public class P4 {
    public static void main ( String args[] ) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        Random ran = new Random();
        ran.setSeed(a);
        int[][] line = new int[5][5];
        for(int i =0;i <5;i++){
            for(int j = 0;j < 5;j++){
                line[i][j] = ran.nextInt(10);
                System.out.print(line[i][j]+"   ");

            }
            System.out.println();

        }
        System.out.println();
        System.out.println();
        for(int i =0;i <5;i++){
            for(int j = 0;j < 5;j++){
                System.out.print(line[j][i]+"   ");
            }
            System.out.println();
        }
    }
}