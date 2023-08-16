// Linear Search
import java.util.Scanner;
public class Linear_Search1 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        System.out.println("Enter the Elements in the array:");
        int[] arr=new int[size];

        for(int i=0;i< arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the elements to be searched:");
        int search=input.nextInt();
        boolean flag=false;
        for (int i=0;i< arr.length;i++){
            if(arr[i]==search){
                System.out.println("Elements found at index :"+i);
                flag=true;
            }
        }

    }
}
