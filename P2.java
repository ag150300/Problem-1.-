import java.util.Scanner;
public class P2 {
    public static void main ( String args[] ) {
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        String sum = "";
        int al = a.length();
        int[] line = new int[al];
        String[] line2 = new String[al];
        for(int i = 0;i < al;i++) {
            char A = a.charAt(i);
            line[i] = A;
            String ac = new Character((char)line[i]).toString();
            line2[i] = ac;
        }
        for(int j = al-1;j >= 0 ;j--){
            sum = sum + line2[j];
        }
        System.out.println(sum);
    }
}