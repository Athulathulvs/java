import java.util.Scanner;

public class Random_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the numbers: ");
        int min=input.nextInt();
        int max=input.nextInt();
        System.out.println("Random number between "+min+ " to " +max+":");
        int a= (int) (Math.random()*(max - min + 1) + min);
        System.out.println(a);
    }
}
