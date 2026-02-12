package If_Else;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter cp");
        int cp=sc.nextInt();
        System.out.println("Enter sp");
        int sp=sc.nextInt();
        if(cp<sp) System.out.println("Profit");
        else if(sp==cp) System.out.println("NO p No l");
        else System.out.println("Loss");

    }
}
