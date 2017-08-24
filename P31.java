import java.util.Scanner;

public class P31{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int j = 1;
        int d = 0;
        int sum = 0;
        for(int i = 0;i <n;i++){
            d= j*(j+1);
            sum =sum+d;
            j++;
        }
        System.out.println(sum);
    }
}