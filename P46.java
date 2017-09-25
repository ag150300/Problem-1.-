import java.util.Random;
import java.util.Scanner;

public class P46{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        Random ran = new Random();
        int seed = scn.nextInt();
        ran.setSeed(seed);
        int m = ran.nextInt(10000);
        String M = Integer.toString(m);

        int n = scn.nextInt();
        String N = Integer.toString(n);
        int[] line = new int[4];
        int[] line2 = new int[4];
        int sum = 0;

        for(int i = 0; i < 4;i++){

            char Mc = M.charAt(i);
            line[i] =Mc;
            System.out.println(line[i]);

            char Nc = N.charAt(i);
            line2[i] = Nc;
            System.out.println(line2[i]);
        }

        for(int j = 0; j < 4 ; j++){
                    if(line[j] == line2[j]){
                        sum++;
           }
        }
        System.out.println(sum);
    }
}