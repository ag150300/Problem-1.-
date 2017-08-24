import java.util.Scanner;

public class P29{
    public static void main(String args[]){
        Scanner scn =new Scanner(System.in);
        int a = scn.nextInt();
        int b =a;
        int j = 1;
        while(a ==0){
            j=j*a;
            a--;
        }
        System.out.println(j);
    }
}