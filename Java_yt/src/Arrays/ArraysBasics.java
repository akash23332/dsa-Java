package Arrays;

import java.util.Scanner;

public class ArraysBasics {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);

//        int[] x={6,19,7,69,9,171,5};
//        System.out.println(x[5]);

//        int[] arr =new int[4];
//        arr[0]=10;
//        arr[1]=20;
//        arr[2]=30;
//        System.out.println(arr[1]);
//        for(int i=0;i<4;i++){
//            System.out.println(arr[i]);
//        }
//        int[] karan=new int[4];
//        for(int i=0;i<4;i++){
//            karan[i]=sc.nextInt();
//        }
//        for (int i=0;i<4;i++){
//            System.out.println(karan[i]);
//        }

//        question
        int arr[]={1,2,3,4,5,6,7};
        for(int i=0;i<arr.length;i++){
            if (i%2==0){
                arr[i]=arr[i]+10;
            }else{
                arr[i]=arr[i]*2;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }



}}



