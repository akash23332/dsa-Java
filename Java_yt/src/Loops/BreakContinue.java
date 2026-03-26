package Loops;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {

//        is number composite
//        Scanner sc =new Scanner(System.in);
//        int n=sc.nextInt();
//        int count=0;
//        for(int i=1;i<=n;i++){
//            if(n%i==0){
//                count++;
//
//            }
//        }
//        if(count>2){
//            System.out.println("Number is comppsite");
//        }else{
//            System.out.println("Not Composite");
//        }
//
//        optimized method

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if (n == 1) System.out.println("neither composite not prime");

        else if(flag==false) System.out.println("compostie number");
        else System.out.println("prime");

    }
}
