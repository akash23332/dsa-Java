package If_Else;
import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        if((l*b)>(2*(l+b))) System.out.println("Yes");
        else System.out.println("No");

    }

 }
