package ExceptionHandling;


import java.util.Scanner;

public class UDException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        try{
            if(age<18){
                throw new AgeException();


            }
            else System.out.println("You can vote");
        }
        catch(Exception e){
            System.out.println("Age is less than 18" +e.getMessage());
        }
        System.out.println("Normal termination");


    }
}
