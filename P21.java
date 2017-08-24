import java.util.Scanner;

public class P21{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        double A = Math.pow(a,2);
        double B = Math.pow(b,2);
        double C = Math.pow(c,2);
        if(a <=b && a<=c && b<= c){
            if(A+B>C){
                System.out.println("銳角三角形");
            }
            if(A+B==C){
                System.out.println("直角三角形");
            }
            if(A+B<C){
                System.out.println("鈍角三角形");
            }
        }else{
            System.out.println("不合法的三角形");
        }
    }
}