import java.util.Scanner;

public class P24{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int A = 0;
        int B = 0;
        int C = 0;
        int[] line = new int[6];
        for(int i =0;i < 6;i++){
            int a = scn.nextInt();
            line[i] = a;
            if(line[i] > 0){
                A++;
            }
            if(line[i] == 0){
                B++;
            }
            if(line[i] < 0){
                C++;
            }
        }
        System.out.println("+="+A);
        System.out.println("0="+B);
        System.out.println("-="+C);
    }
}