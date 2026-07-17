package Recursion;

public class reverseAdigit {
    public static int reverse(int n,int r){
        if(n==0){

            return r;
        }
        return  reverse(n/10,r*10+n%10);

    }
    public static void main(String[] args) {

        int n=10;
//        int sum=0;
//        while(n!=0){
//
//
//            int rem=n%10;
//            sum=sum*10+rem;
//            n=n/10;
//
//        }
//        System.out.println(sum);
        System.out.println(reverse(n,0));

    }
}
