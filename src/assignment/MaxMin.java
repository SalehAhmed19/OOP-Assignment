package assignment;

import java.util.Scanner;

public class MaxMin {
    public static void main(String args[]){
        int a, b, c, d, max, min ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the second number: ");
        b = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the third number: ");
        c = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the fourth number: ");
        d = Integer.parseInt(sc.nextLine());

//        if(a > b && a > c && a > d){
//            max = a;
//        }
//        else if(b > a && b > c && b > d){
//            max = b;
//        }
//        else if(c > a && c > b && c > d){
//            max = c;
//        }
//        else {
//            max = d;
//        }
//
//        if(a < b && a < c && a < d){
//            min = a;
//        }
//        else if(b < a && b < c && b < d){
//            min = b;
//        }
//        else if(c < a && c < b && c < d){
//            min = c;
//        }
//        else {
//            min = d;
//        }

        max = Math.max(a, Math.max(b, Math.max(c, d)));


        min = Math.min(a, Math.min(b, Math.min(c, d)));

        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);

    }
}
