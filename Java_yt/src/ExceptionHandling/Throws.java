//package ExceptionHandling;
//
//public class Throws {
//    public static void main(String[] args)  throws InterruptedException
//    {
//        for(int i=0;i<10;i++){
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//    }
//}

package ExceptionHandling;

public class Throws {
    public static void main(String[] args)
    {
        try{
        for(int i=0;i<10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }}
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
