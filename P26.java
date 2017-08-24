import java.util.Scanner;

public class P26{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int[][] line = new int[5][7];
        int[][] line2 = new int[7][5];
        for(int i = 0;i <5;i++){
            for(int j = 0;j <7;j++) {
                int a = scn.nextInt();
                line[i][j] =a;
                line2[j][i] = line[i][j];
            }

        }
        for(int i = 0;i < 7;i++){
            for(int j = 0;j < 5;j++){
                System.out.print(line2[i][j]+" ");
            }
            System.out.println();
        }
    }
}