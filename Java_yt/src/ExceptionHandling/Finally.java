package ExceptionHandling;

public class Finally {
    public static void main(String[] args) {
        try{
            System.out.println("learn Coding");
            int a=20,b=2,c;
            c=a/b;
;
            System.out.println(c);
            System.out.println("like");
        }
        catch( ArithmeticException a){
            System.out.println("cannnot divide by zero");
        }
        finally {
            System.out.println("subscribe");
        }
        System.out.println("main method ended");
    }
}
