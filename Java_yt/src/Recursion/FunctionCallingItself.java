package Recursion;

import java.util.Scanner;

public class FunctionCallingItself {
    public static void main(String[] args) {
//        ajay(1);

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
//    public  static  void ajay(int n){
////        if(n==5) return;
////        System.out.println("Priya");
////        ajay(n+1);
//
//
//    }


    public static void print(int n){
//        if(x==n) return;
//        System.out.println(x);
//
//
//        print(x+1,n);
        if(n==0) return;
        print(n-1);
        System.out.println(n);



    }
}
