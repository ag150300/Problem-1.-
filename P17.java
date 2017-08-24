import java.util.Scanner;

public class P17{
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        int al = a.length();
        String[] line = new String[al];
        for(int i = 0; i < al;i++){
            char A = a.charAt(i);
            int b =Integer.valueOf(A);
            String B = new Character((char)b).toString();
            line[i] = B;
            System.out.print(line[i]+"  ");
        }
    }
}