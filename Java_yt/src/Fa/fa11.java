package Fa;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.*;
public class fa11 {
    public static void main(String[] args) {
//        String Digit="1234";
//        char[] arr=Digit.toCharArray();
//       int i=Digit.length()-1;
//       int j=Digit.length()-2;
//        while(j>=0){
//            if(arr[j]<arr[i]){
//              char temp=arr[j];
//              arr[j]=arr[i];
//              arr[i]=temp;
//              break;
//            }
//
//            i--;
//            j--;
//        }
//        System.out.println(new String(arr));


//        String s="hi Akash";
//        String d="Akash";
//        String[] n=s.split(" ");
//        int count=0;
//        for(int i=0;i<n.length;i++){
//            if(n[i].equals(d)){
//                count++;
//            }
//        }
//        System.out.println(count);







//
//        int n=20;
//        try{
//            if(n>20){
//                throw new Exception("1");
//            }
//            else if(n<0){
//                throw new Exception("2");
//            }
//            else if(n==0){
//                throw new Exception("3");
//            }else{
//
//                if(n<=10){
//                    int fact=1;
//                    for(int i=1;i<=n;i++){
//                        fact=fact*i;
//
//                    }
//                    System.out.println(fact);
//                }
//
//                else if(n>10){
//                    int sum=0;
//                    for(int i=0;i<=n;i++){
//                      int total=1;
//                        total=i+2*total;
//                        sum=total;
//                    }
//                    System.out.println(sum);
//                }
//            }
//
//        }
//
//        String s="codecode";
//int ans=-1;
//    int freq[]=new int[26];
//    for(int i=0;i<s.length();i++){
//        freq[s.charAt(i)-'a']++;
//
//
//    }
//    for(int i=0;i<s.length();i++){
//        if(freq[s.charAt(i)-'a']==1){
//
//            ans=i;
//            break;
//        }
//    }
//        System.out.println(ans);
//


//        String email;

       int[] arr={1,2,4,122};
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=1;i<arr.length;i++){
           if(map.containsKey(i)){
               map.put(i,map.get(i)+1);
           }else{
               map.put(i,1);
           }

       }
        System.out.println(map);
    }


}
