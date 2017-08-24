import java.util.Scanner;

public class P39{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        int[][] line = new int[n][9];
        for(int i =0;i < n;i++){
            a = i+1;
            b= 1;
            for(int j =0;j < 9;j++){
                line[i][j] = a*b;
                b++;
                System.out.print(line[i][j]+"   ");
            }
            System.out.println();
        }
    }
}