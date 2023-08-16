// Find Numbers with Even Number of Digits java
public class array_3 {
    public static void main(String[] args) {
        int[] arr={121,345,-218,6,7896};
        int count=0;
        for(int i=0;i<arr.length;i++){
            int digits=0;
            while(arr[i]>0){
                digits++;
                arr[i]/=10;
            }
            if(digits%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
