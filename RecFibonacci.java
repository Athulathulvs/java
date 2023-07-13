
//Finonacci series using Recursion

import java.util.Scanner;

public class RecFibonacci {
    static int n1 = 0;
    static int n2 = 1;
    static int n3;

    public static void main(String[] args) {
        System.out.println("Enter the count: ");
        Scanner scan=new Scanner(System.in);
        int count=scan.nextInt();
        System.out.print(n1 + " " + n2);
        printfibo(count - 2);
    }

    static void printfibo(int count) {
        if (count> 0) {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            printfibo(count-1);
        }
    }
}