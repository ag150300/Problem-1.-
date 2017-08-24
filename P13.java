import java.util.Scanner;

public class P13{
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        int a= scn.nextInt();
        if(a%2 == 0){
            System.out.println("偶數");
        }else{
            System.out.println("基數");
        }
    }
}