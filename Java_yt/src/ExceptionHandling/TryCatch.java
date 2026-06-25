package ExceptionHandling;

import Basic.ArthemeticOptOnInt;

public class TryCatch {
    public static void main(String[] args) {
//        airthemetic exception


//        try {
//            int a = 1;
//            int b = 0;
//            int c = a / b;
//            System.out.println(c);
//        }
//
//   catch (Exception e) {
//       System.out.println("airthemtic exception");}



//        null pointer exception

        try{
            String a;
            a=null;
            System.out.println(a.toUpperCase());
        }
        catch (Exception e){
            System.out.println("Null ponter exception");
        }


//        Number format exception


        String s="ankit";
        try{
          int a=Integer.parseInt(s);
            System.out.println(a);




        }
        catch (NumberFormatException e){
            System.out.println(e);
        }

        }
//
//
//
//    }
}
