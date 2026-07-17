package Recursion;

public class RecOnArray {
//    public static void recPrint(int[] arr,int idx){
//
//        if(idx==arr.length) return;
//
//        recPrint(arr,idx+1);
//        System.out.println(arr[idx]);
//    }
    public static boolean exists(int[] arr,int ele,int idx){

        if(idx==arr.length) return false;
        if(arr[idx]==ele) return true;
        return exists(arr,ele,idx+1);


    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};

//        recPrint(arr,0);
        System.out.println(exists(arr,4,0));
    }

}
