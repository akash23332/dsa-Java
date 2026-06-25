//import java.util.Arrays;
//import java.util.Scanner;
//
//public class exam {
//    public static void main(String[] args) {
////        Scanner sc=new Scanner(System.in);
////        String s=sc.nextLine();
//
////        String rev="";
////        for(int i=s.length()-1;i>=0;i--){
////            rev=rev+s.charAt(i);
////
////
////        }
////        if(s.equals(rev)){
////            System.out.println("Palindrome");
////        }
////
////        else {
////            System.out.println("not palindrome");
////        }
//
//
////        int count=0;
////
////        for(int i=0;i<s.length();i++){
////
////            if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'){
////                count++;
////            }
////        }
////        System.out.println(count);
////        int count=0;
////        for(int i=0;i<s.length();i++){
////            if(s.charAt(i)==' '){
////                count++;
////
////            }
////
////        }
////        System.out.println(count+1);
//
//
//
////String s="banana";
////int[] freq=new int[256];
////for(int i=0;i<s.length();i++){
////    freq[s.charAt(i)]++;
////}
////for(int i=0;i<256;i++){
////    if(freq[i]>0){
////        System.out.println((char)i +"=="+freq[i]);
////    }
////}
//
////
////        String a="cat";
////        String b="act";
////        char[] x=a.toCharArray();
////        char[] y=b.toCharArray();
////
////        Arrays.sort(x);
////        Arrays.sort(y);
////
////
////
////        System.out.println(Arrays.equals(x,y));
//
//
//
////        String a="heloo radhika";
////        String[] words=a.split(" ");
////        for(String w:words){
////            String ans=w.substring(0,1).toUpperCase()+w.substring(1);
////            System.out.print(ans+" ");
////
////        }
////
//    }
//}
//
//class Myexception extends Exception{
//    Myexception(String msg){
//        super(msg);
//    }
//
//}
//public class exam {
//    public static void main(String[] args) {
//
//        int age=13;
//        try {
//            if(age < 18) {
//
//                throw new Myexception(
//                        "Under Age");
//            }
//
//            System.out.println("Eligible");
//        }
//        catch (Myexception e){
//            System.out.println(e.getMessage());
//        }
//
//    }
//}

//class Myexception extends Exception{
//    Myexception(String msg){
//        super(msg);
//    }
//
//
//        }

//public class exam {
//    public static void main(String[] args) {
//
//        int age=18;
//        try {
//            if (age < 18) {
//                throw new Myexception("invalid");
//            }
//
//            System.out.println("Eligible");
//        }
//        catch(Myexception e) {
//            System.out.println(e.getMessage());
//        }
//
//
//        String email="akak9781189@gmailcom";
//        try{
//           int at=email.indexOf('@');
//           int dot=email.indexOf('.');
//           if(at==-1 || dot ==-1 || at>dot){
//               throw new Exception("Invalid email");
//           }
//           System.out.println("valid");
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }



//class Myexception extends Exception{
//    Myexception(String msg){
//        super(msg);
//    }
//}
//public class exam {
//    public static void main(String[] args) {
//
//        int age =21;
//        try {
//            if (age < 18) {
//                throw new Exception("invalidage");
//            }
//            System.out.println("Valid age");
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }

//class Mythread extends Thread{
//    public  void run(){
//        System.out.println("thread is running");
//    }
//}
//public class exam {
//    public static void main(String[] args) {
//        Mythread t=new Mythread();
//        t.start();
//
//    }
//
//class MyThread extends Thread {
//
//    public void run() {
//
//        for(int i=1;i<=5;i++) {
//            System.out.println("Child Thread");
//        }
//    }
//}







