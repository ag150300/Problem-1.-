import java.util.Scanner;
public class P2 {
    public static void main ( String args[] ) {
        Scanner sc = new Scanner(System.in);
        int D=0;
        int sum=0;
        System.out.print("請輸入數字:");
        int a = sc.nextInt();
        String set = Integer.toString(a);
        int X =set.length();
        for(int b=1;b<=X;b++) {
            sum = sum + a % 10;
            a = a / 10;

        }
        System.out.println(sum);

        for(int b=1;b<=X;b++){
            char d=set.charAt(D);
            D=D+1;

            if(b != 5){
                System.out.print(d+"+");
            }else{
                System.out.print(d+"="+sum);
            }
        }
    }
}