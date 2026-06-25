package ExceptionHandling;

public class MultipleTryCatch {
    public static void main(String[] args) {
        try{
            int a=1,b=1,c;
            c=a/b;
            System.out.println(c);

        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");

        }
        try{
            int a[]={10,20,30,40};
            System.out.println(a[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("beyond array list");
        }
    }
}
