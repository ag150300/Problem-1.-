import java.util.Scanner;

public class P28{
    public static void main(String args[]){
        Scanner scn =new Scanner(System.in);
        int a = scn.nextInt();
        int b =a;
        int j = 1;
        for(int i = 0;i < b;i++){
        j =a*j;
        a--;
        }
        System.out.println(j);
    }
}