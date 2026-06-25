package Fa;
//class bankAcc1 {
//    String accountHolder;
//    double currentbalance;
//    int transactions;
//
//    bankAcc1(String name) {
//        this.accountHolder = name;
//        currentbalance = 0;
//        transactions = 0;
//    }
//
//    void deposit(int amount) {
//        if (amount > 0 && amount <= 500) {
//            currentbalance += amount;
//
//            transactions++;
//
//        }
//
//
//    }
//    void withdraw(int amount) {
//
//        if (amount > 0 && amount <= currentbalance) {
//
//            currentbalance -= amount;
//
//            transactions++;
//        }
//    }
//
//
//    boolean bankfee(double fee) {
//        double totalfee = 0;
//        for (int i = 1; i <= transactions; i++) {
//            totalfee = totalfee + (fee * i);
//        }
//
//        currentbalance = currentbalance - totalfee;
//
//
//  if (currentbalance > 0) {
//        return true;
//    } else {
//        currentbalance = 0;
//        return false;
//    }
//}
//
//}






//
//class Date{
//    int month;
//    int date;
//    Date(){
//        month=1;
//        date=1;
//    }
//    Date(int m,int d){
//        month=m;
//        date=d;
//    }
//    void daysInMonth(int month){
//        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
//            System.out.println(31);
//        }else if( month==4 || month==6 || month==9 || month==11 ){
//            System.out.println(30);
//        }else {
//            System.out.println(28);
//        }
//    }
//    void  Day(){
//        System.out.println(date);
//    }
//    void  Month(){
//        System.out.println(month);
//    }
//    void nextday(){
//        if( month==2 && date==28 ){
//            date=1;
//            month++;
//        } else if ((month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) && date==31) {
//            date=1;
//            month++;
//
//        } else if(( month==4 || month==6 || month==9 || month==11 ) && date==30) {
//            date=1;
//            month++;
//        }
//        else{
//            date++;
//        }
//        System.out.println(date+"/"+month);
//    }
//
//
//}


import java.util.Scanner;

//
//class  box{
//    int length;
//    int breadth;
//    int height;
//    box(){
//        length=0;
//        breadth=0;
//        height=0;
//
//    }
//    box(int l,int b,int h){
//        length=l;
//        breadth=b;
//        height=h;
//    }
//
//    int getLength(){
//        return length;
//    }
//    int getBreadth(){
//        return breadth;
//    }
//    int getHeight(){
//        return height;
//    }
//    long  CalculateVolume(int length,int breadth,int height){
//        return length*breadth*height;
//    }
//}
public class Fa2 {

    public static void main(String[] args) {

//        bankAcc1 b1 = new bankAcc1("Akash");
//
//        b1.deposit(15);
//        b1.deposit(25);
//        b1.deposit(10);
//
//
//
//
//
//        System.out.println(b1.bankfee(20));


//        Date d = new Date(2, 28);
//
//        d.nextday();


//
//box b1=new box();
//b1.CalculateVolume(1,2,3);

//
//        int[] arr1={1,2,3,4};
//        int[] arr2={4,3,2,9};
//        int sum1=0;
//        int sum2=0;
//        for(int i=0;i<arr1.length;i++){
//            sum1+=arr1[i];
//        }
//        for(int i=0;i<arr2.length;i++){
//            sum2+=arr2[i];
//        }
//        if(sum1==sum2){
//            System.out.println(1);
//        }else {
//            System.out.println(0);
//        }


//        int[] arr={12,27,14,11,25,6,7};
//        int count=0;
//        for(int i=0;i<arr.length;i++){
//            int j;
//            for( j=i+1;j<arr.length;j++){
//                if(arr[i]<arr[j]){
//                    break;
//
//
//
//                }
//
//            }
//            if(j==arr.length){
//                count++;
//            }
//
//        }
//        System.out.println(count);


//        int[][] arr1={
//                {1,2,3},
//                {3,2,1},
//                {4,3,1}
//        };
//       int sum=0;
//        for(int i=0;i<arr1.length;i++){
//            for(int j=0;j< arr1.length;j++){
//                if(i+j==arr1.length-1){
//                    sum+=arr1[i][j];
//                }
//
//            }
//        }
//        System.out.println(sum);
////
//        int[] arr={2,2,1,1,1,2,2};
//        int n=7;
//
//        for(int i=0;i<arr.length;i++){
//            int c=0;
//            for(int j=0;j<arr.length;j++){
//                if(arr[i]==arr[j]) {
//                    c++;
//                }
//
//
//            }
//            if(c>=n/2){
//                System.out.println(arr[i]);
//                return;
//            }else {
//                System.out.println(-1);
//            }
//        }

        int[][] arr1={
                {1,2},
                {2,3}
        };
int [][] arr2={
        {3,4},
        {4,5}
};
int r1=2;
int c1=2;
int r2=2;
int c2=2;

        int[][] result = new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    result[i][j]+=arr1[i][k]*arr2[k][i];
                }
            }
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
    }
}
}
