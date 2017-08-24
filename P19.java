import java.util.Random;
import java.util.Scanner;

public class P19{
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        Random ran =new Random();
        ran.setSeed(a);
        int max = 0;
        int min = 0;
        int[] line = new int[3];
        for(int i =0; i<3;i++){
            line[i]=ran.nextInt(100)+1;
            System.out.println(line[i]);
        }
        System.out.println("");
        max = line[0];
        min = line[0];
     for(int i = 0;i < 3;i++){
         if(line[i]>max){
             max = line[i];
         }
         if(line[i]<min){
             line[i] = min;
         }
     }
        System.out.println(max);
        System.out.println(min);
    }
}