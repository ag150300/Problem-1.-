import java.util.Scanner;

public class P12{
    public static void main (String args[]){
        Scanner scn =new Scanner(System.in);
        int cm =scn.nextInt();
        int kg =scn.nextInt();
        double hjp4 = cm/2.54;
        double pun = kg/0.454;
        System.out.println(hjp4);
        System.out.println(pun);
    }
}