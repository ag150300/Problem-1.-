import java.util.Scanner;

public class P5{
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        char A = a.charAt(0);
        int line[] = new int[1];
        line[0] = A;
       if(line[0] > 64 && line[0] < 91){
           System.out.print("大寫");
       }else if(line[0] > 96 && line[0] < 123){
            System.out.print("小寫");
        }else{
           System.out.print("特殊字元");
       }
    }
}