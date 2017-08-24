import java.util.Scanner;

public class P40{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        int b = a.length();
        int[] line = new int[b];
        for(int i = 0;i < b;i++) {
            char A = a.charAt(i);
            line[i] = A;
            String B = new Character((char)line[i]).toString();
            int x = Integer.valueOf(B);
            line[i] = x;
        }
        for(int j = b-1;j >= 0;j--){
            System.out.print(line[j]);
        }
        System.out.println();
    }
}