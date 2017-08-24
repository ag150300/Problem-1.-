import java.util.Scanner;

public class P20{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if(a <=b && a<=c && b<= c){
            System.out.println("合法");
        }else{
            System.out.println("不合法");
        }
    }
}