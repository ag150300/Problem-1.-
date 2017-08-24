import java.util.Scanner;

public class P23{
    public static void main (String args[]){
        Scanner scn =new Scanner(System.in);
        String a = scn.next();
        int al = a.length();
        String[] line =new String[4];
        if(al == 1){
            for(int i = 0;i < 1;i++) {
                char A = a.charAt(i);
                String Ac =Integer.toString(A);
                line[i] = Ac;
                int an = Integer.valueOf(line[i]);
                String An1 =new Character((char)an).toString();
                line[i] = An1;
            }
            System.out.print(line[0]+"  dollar  ");
        }
        if(al == 2){
            for(int i = 0;i < 2;i++) {
                char A = a.charAt(i);
                String Ac =Integer.toString(A);
                line[i] = Ac;
                int an = Integer.valueOf(line[i]);
                String An1 =new Character((char)an).toString();
                line[i] = An1;
            }
            System.out.print(line[0]+"  ten "+line[1]+" dollar  ");
        }
        if(al == 3){
            for(int i = 0;i < 3;i++) {
                char A = a.charAt(i);
                String Ac =Integer.toString(A);
                line[i] = Ac;
                int an = Integer.valueOf(line[i]);
                String An1 =new Character((char)an).toString();
                line[i] = An1;
            }
            System.out.print(line[0]+"  hundred "+line[1]+" ten "+line[2]+" dollar  ");
        }
        if(al == 4){
        for(int i = 0;i < 4;i++) {
            char A = a.charAt(i);
            String Ac =Integer.toString(A);
            line[i] = Ac;
            int an = Integer.valueOf(line[i]);
            String An1 =new Character((char)an).toString();
            line[i] = An1;
        }
        System.out.print(line[0]+"  thousand  "+line[1]+"   hundred "+line[2]+" ten "+line[3]+" dollar  ");
        }
    }
}