import java.util.Scanner;

public class P11{
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        int w =scn.nextInt();
        int s =scn.nextInt();
        int y = 1;
        int q= 0;
        int[][] line = new int[s][w];
        for(int h = 0;h < s;h++){
            line[h][0] = y;
            y++;
            q = h;
            q++;
            for(int l = 1;l <w;l++){
               q= q+line[h][0];
                line[h][l] = q;
                System.out.print(line[h][l-1]+"   ");
            }
            System.out.println();
        }
    }
}