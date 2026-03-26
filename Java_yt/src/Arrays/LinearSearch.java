package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int x=8;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                flag=true;
                break;
            }
        }
        if(flag==true) System.out.println("found");
        else System.out.println("Missing");
    }
}
