import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int i,flag=0;
        int m=0;
        System.out.println("enter a number");
        Scanner Scan=new Scanner((System.in));
        int n=Scan.nextInt();
        m=n/2;
        if(n==0 || n==1){
            System.out.println(n+" is not prime");
        }else {
            for(i=2;i<=n;i++){
                if(n % i == 0){
                    System.out.println(n+" is note prime");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(n+" is prime");
            }
        }
    }
}