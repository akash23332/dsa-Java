package Fa;

public class fa4 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=5;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int k=2;k<=5;k++){
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }

        }




//        int n=31;
//        if(n>=1 && n<=3){
//            System.out.println(10);
//        }else if(n>=4 && n<=10){
//            System.out.println(20);
//
//        }
//        else if(n>=11 && n<=30){
//            System.out.println(50);
//
//        }else{
//            System.out.println("Membership Cancelled");
//        }
//        int n=3457;
//        int num=n/1000;
//        int den=n%10;
//        System.out.println(num+den);

//int n=100;
//int m=111;
//int count=0;
//for(int i=100;i<=111;i++){
//int temp=i;
//    int sum=0;
//    while(temp!=0){
//        int digit=temp%10;
//        sum=sum*10+digit;
//        temp=temp/10;
//
//    }
//    if(sum==i){
//        count++;
//    }
//}
//        System.out.println(count);
    }
}
