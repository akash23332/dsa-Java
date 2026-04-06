package OOPS;

import java.util.Arrays;
public class Marks {
    public static class StudentData{
        String name;
        int rno;

        int[] marks;
        StudentData(int[] s){

//            marks=s;
            marks= Arrays.copyOf(s,s.length);
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        StudentData s1=new StudentData(arr);
        s1.marks[0]=12;
        System.out.println(arr[0]);
//        s1.marks[0]=89;
//        s1.marks[1]=95;
    }
}
