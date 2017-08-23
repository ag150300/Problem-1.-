import java.util.Scanner;

public class P10{
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String a = scn.next();
        String[][] line = new String[n][n];
        for(int h = 0;h < n;h++){
            for(int l =0;l < n;l++){
                line[h][l] = a;
                System.out.print(line[h][l]);
            }
            System.out.println();
        }
    }
}