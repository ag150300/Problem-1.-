import java.util.Scanner;

public class P30{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("ID"+"   "+"NAME"+"  "+"Chinese"+"   "+"English"+"   "+"Math"+"  "+"Avg");
        for(int i =0;i < 5;i++){
            int ID = scn.nextInt();
            String Name = scn.next();
            int Ch = scn.nextInt();
            int En = scn.nextInt();
            int Ma = scn.nextInt();
            double Avg;
            Avg = (Ch+En+Ma)/3;
            System.out.println(ID+"       "+Name+"    "+Ch+"       "+En+"     "+Ma+"     "+Avg);
        }

    }
}