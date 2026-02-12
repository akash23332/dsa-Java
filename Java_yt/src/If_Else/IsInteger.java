package If_Else;

import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        int x=(int)n;
        if(n-x>0) System.out.println("not an integer");
        else System.out.println(" integer");
}
}
