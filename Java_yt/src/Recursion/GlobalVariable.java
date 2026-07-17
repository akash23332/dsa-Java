package Recursion;

public class GlobalVariable {
    static int x=10;
    public static void main(String[] args) {
        fun();

    }
    public static  void fun(){
        x=20;
        System.out.println(x);
    }

}
