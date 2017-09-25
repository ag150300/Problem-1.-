import java.util.Random;
import java.util.Scanner;

public class P45{
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        int seed = scn.nextInt();
        Random ran = new Random();
        ran.setSeed(seed);
        int ranm = ran.nextInt(100)+1;
        boolean flag =false;
        while(flag == false){
            int in1 =scn.nextInt();
            if(in1 > ranm){
                System.out.println("big");
            }
            if(in1 <ranm){
                System.out.println("small");
            }
            if(in1 == ranm){
                System.out.println("true");
                flag = true;
            }
        }
    }
}