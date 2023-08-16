import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=input.nextInt();
        int temp=num;
        int last=0;
        int sum = 0;
        int digits = 0;
        while (temp>0){
            temp=temp/10;
            digits++;
        }
        temp=num;
        while(temp>0){
            last=temp%10;
            sum += (int) Math.pow(last,digits);
            temp/=10;
        }
        if(num==sum){
            System.out.println(num+ " is a amstrome number");
        }else
            System.out.println( num+ " is not a amstrome number");

    }
}
