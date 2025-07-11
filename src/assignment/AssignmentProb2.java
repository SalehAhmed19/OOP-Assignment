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

        max = Math.max(a, Math.max(b, Math.max(c, d)));


        min = Math.min(a, Math.min(b, Math.min(c, d)));

        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);

    }
}
