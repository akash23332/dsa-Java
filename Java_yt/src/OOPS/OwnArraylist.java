//package OOPS;
//
//import java.lang.reflect.Array;
//
//class ArrayList{
//    int[] arr= new int[10];
//    int idx=0;
//    int size=0;
//    ArrayList(int capacity){
//        arr=new int[capacity];
//    }
//    void add(int ele){
//        if(idx==arr.length){
//            int[] arr2=new int [arr.length*2];
//            for(int i=0;i< arr.length;i++){
//                arr2[i]=arr[i];
//            }
//            arr=arr2;
//        }
//        arr[idx++] =ele;
//        size++;
//    }
//    int capacity(){
//        return  arr.length;
//    }
//    int get(int index){
//        return  arr[index];
//    }
//    void  display(){
//        for(int i=0;i<size;i++){
//            System.out.println(arr[i]+" ");
//        }
//        System.out.println();
//    }
//}
//public class OwnArraylist {
//    public static void main(String[] args) {
//        ArrayList arr=new ArrayList(8);
//        arr.add(10);
//        arr.add(20);
//        arr.display();
//        System.out.println(arr.get);
//
//
//    }
//}
