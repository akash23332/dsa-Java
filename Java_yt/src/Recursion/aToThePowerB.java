package Recursion;
import java.util.*;
public class aToThePowerB {
    public static void main(String[] args) {
        System.out.println(ab(2,10));
    }
    public static int ab(int x,int n){
        if(n==0) return 1;
        int total=x*ab(x,n-1);

        return total;
    }
}
