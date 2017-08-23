import java.util.Scanner;

public class P6{
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        char A = a.charAt(0);
        int line[] = new int[1];
        line[0] = A;
        if(line[0] > 64 && line[0] < 91){
            line[0] = line[0]+32;
            String b = new Character((char)line[0]).toString();
            System.out.println(b);
        }else if(line[0] > 96 && line[0] < 123){
            line[0] = line[0]-32;
            String b = new Character((char)line[0]).toString();
            System.out.println(b);
        }else{
            System.out.print("特殊字元");
        }
    }
}