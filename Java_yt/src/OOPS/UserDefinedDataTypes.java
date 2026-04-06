package OOPS;
import java.util.Scanner;

public class UserDefinedDataTypes {
    public static class Student{
        String  name;
        int rno;
        double cgpa;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Student s1=new Student();
        s1.name="Akash";
        s1.rno=sc.nextInt();
        s1.cgpa=9.3;

        Student s2=new Student();
        s2.name="Radhika";
        s2.rno=64;
        s2.cgpa=9.9;

        System.out.println(s1.name);


    }
}
