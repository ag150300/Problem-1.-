import java.util.Scanner;

public class P38{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int count = 0;
        System.out.println("1");
        while(a != 1){
           for(int n =2;n < a;n++){
               if(a%n == 0){
                   count++;
                   System.out.println(n);
               }
               else{

               }
           }
           break;
        }
        System.out.println(a);
        if(count !=0){
            System.out.println("NO");
        }
        else{
            System.out.println("Yes");
        }
    }
}