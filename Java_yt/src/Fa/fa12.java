//package Fa;
//import java.util.InputMismatchException;
//import javax.sound.midi.Soundbank;
//import java.awt.*;
//import java.util.Scanner;
//
//////
////class MyException extends Exception {
////    MyException(String messsage){
////        super(messsage);
////    }
////class MyCal {
////    long power(int n, int p) throws MyException {
////        if (n < 0 || p < 0) {
////            throw new MyException("n or p");
////        }
////        if (n == 0 && p == 0) {
////            throw new MyException("n and p should not be zero");
////        }
////        System.out.println(Math.pow(n, p));
////    }
////}
//
////
////class Bank{
////    int amount;
////    int transaction;
////    Bank(int amount){
////        this.amount=amount;
////        transaction=0;
////
////    }
////
////    void Deposit(int money){
////        amount=amount+money;
////        transaction+=1;
////
////    }
////    void Withdrawl(int money){
////        amount=amount-money;
////        transaction+=1;
////    }
////
////    void bankFees(int fee){
////        int  total=fee*transaction;
////        if(amount-total>=0){
////            System.out.println(true);
////        }
////        else{
////            System.out.println(false);
////        }
////    }
////}
//
////
////class polygon{
////   protected int sides;
////    public  polygon(int s){
////        sides=s;
////    }
////public void draw(){
////    if(sides==4){
////        System.out.println("square has 4 sides");
////    }
////    else if(sides==3){
////        System.out.println("triangle has 3 sides");
////    }
////    else {
////        System.out.println("polyogn of"+sides+"sides");
////    }
////}
////}
////class Square extends  polygon{
////   Square() {
////       super(4);
////   }
////
////}
////class Triangle extends polygon {
////    Triangle(){
////        super(3);
////    }
////
////}
//
//public class fa12 {
//    public static void main(String[] args) {
////        String alpha="abcdefghijklmnopqrstuvwxuyz ";
//
////        Scanner sc=new Scanner(System.in);
////        String s=sc.nextLine().toLowerCase();
////        boolean flag=false;
////        for(int i=0;i<alpha.length();i++){
////            if(s.indexOf(alpha.charAt(i))==-1){
////                flag=true;
////            }
////        }
////        if(flag==true){
////            System.out.println("not panagram");
////        }else {
////            System.out.println("panagram");
////        }
//
////        Scanner sc=new Scanner(System.in);
////        String s=sc.nextLine();
////        int i=0;
////        int j=0;
////        while(j<=s.length()){
////            if( j==s.length() || s.charAt(j)==' '){
////
////                for(int k=j-1;k>=i;k--){
////                    System.out.print(s.charAt(k));
////
////                }System.out.print(" ");
////
////
////
////                i=j+1;
////
////            }
////
////
////            j++;
////
////
////
////        }
//
////        Scanner sc=new Scanner(System.in);
////
////        String s=sc.nextLine();
////        for(int i=0;i<s.length();i++){
////            if( s.charAt(i)=='1' || s.charAt(i)=='2' || s.charAt(i)=='3' || s.charAt(i)=='4' || s.charAt(i)=='5' || s.charAt(i)=='6' ||s.charAt(i)=='7' || s.charAt(i)=='8' || s.charAt(i)=='9' ){
////                for(int j=1;j<s.charAt(i)-'0';j++){
////                    System.out.print(s.charAt(i-1));
////
////                }
////            }else {
////                System.out.print(s.charAt(i));
////            }
////        }
//
////
////        Bank b = new Bank(1000);
////
////        b.Deposit(500);     // 1500
////        b.Withdrawl(200);   // 1300
////
////        b.bankFees(1000);    // 2 transactions => fee = 200
////
////        System.out.println(b.amount);
//
//
//
////        Scanner sc = new Scanner(System.in);
////        int s = sc.nextInt();
//
////        Square sq = new Square();
////        Triangle tr = new Triangle();
////        polygon p = new polygon(s);
////
////        sq.draw();
////        tr.draw();
////        p.draw();
//
//
//
//
//
//
//
//
//
//
//
//
//
////
////try {
////    Scanner sc = new Scanner(System.in);
////    int n = sc.nextInt();
////
////    int s=sc.nextInt();
////    int div;
////     div = n / s;
////    System.out.println(div);
////}
////catch (ArithmeticException e){
////    System.out.println(e+"/0");
////
////}
////catch (InputMismatchException e){
////    System.out.println(e);
////}
//
//
////String password;
////
////
////try{
////    if (password.length() < 8) {
////        throw 'd';
////    }
////
////    boolean upper = false;
////    boolean lower = false;
////    boolean digit = false;
////    for(int i=0;i<password.length();i++){
////        char ch=password.charAt(i);
////        if(Character.isUpperCase(ch)){
////            upper=true;
////        }
////        else if(Character.isLowerCase(ch)){
////            lower=true;
////        }
////        else if(Character.isDigit(ch)){
////            digit=true;
////        }
////        if(!(upper && lower & digit)){
////            throw 's';
////            System.out.println("Valid password.");
////        }
////         catch (char e) {   // Some platforms may not allow this
////            if (e == 'd') {
////                System.out.println(
////                        "Invalid password: Password length is less than 8 characters."
////                );
////            }
////            else if (e == 's') {
////                System.out.println(
////                        "Invalid password: Password must contain at least one uppercase letter, one lowercase letter, one digit."
////                );
////    }
////
////}
////
////        String password="wqer3jri3";
////try {
////
////    int count = 0;
////    if(password.length()<6){
////            throw new Exception("s");
////        }
////
////    boolean digit = false;
////    for (int i = 0; i < password.length(); i++) {
////        if (Character.isDigit(password.charAt(i))) {
////            digit = true;
////        }
////    }
////    if (!digit) {
////        throw new Exception("d");
////    }
////    System.out.println("Password is valid");
////
////}
////catch (Exception e){
////    if(e.getMessage().equals("d")){
////        System.out.println(" No digit!");
////    }else if(e.getMessage().equals("s")){
////        System.out.println(" Too short!");
////    }
////}
//
//
//
////
////
////            }
////
////
////
////}
