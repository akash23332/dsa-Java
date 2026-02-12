package If_Else;

import java.util.Scanner;

public class SIdeOfAAtriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        int a = sc.nextInt();

        System.out.print("Enter side b: ");
        int b = sc.nextInt();

        System.out.print("Enter side c: ");
        int c = sc.nextInt();

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Yes, Triangle is possible");
        } else {
            System.out.println("No, Triangle is not possible");
        }

        sc.close();
    }
}
