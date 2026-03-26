package Arrays;

public class secondMax {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,};
        int max1=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max1=arr[i];
            }
        }
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max2 && arr[i]!=max1){
                max2=arr[i];
            }
        }
        System.out.println(max1);
        System.out.println(max2);

    }
}
