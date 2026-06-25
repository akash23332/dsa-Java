package Fa;

import java.util.Scanner;

public class fa3 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int k=sc.nextInt() ;
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//       int i=0;
//       int j=k-1;
//       while(i<j){
//           int temp=arr[i];
//           arr[i]=arr[j];
//           arr[j]=temp;
//           i++;
//           j--;
//
//       }
//       i=k;
//       j=n-1;
//        while(i<j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//
//        }
//        i=0;
//        j=n-1;
//
//        while(i<j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//
//        }
//        for(int l=0;l<n;l++){
//            System.out.print(arr[l]);
//        }


//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//
//        for(int i=0;i<n;i++){
//
//            for(int j=0;j<n;j++){
//                if(arr[i]!=arr[j]){
//                    System.out.println(arr[i]);
//                }
//
//            }
//
//
//        }

        ;
        int[][] arr1={{1,2,3},
                {3,4,5},
                {5,3,1}};
     int sum=0;
     for(int i=0;i<arr1.length;i++){

             sum=sum+arr1[i][1];

    }
        System.out.println(sum);
}}
