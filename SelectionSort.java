import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {3,1,2,4,5};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i -1;
            int maxindex = getmaxindex(arr,0,last);
            swap(arr,maxindex,last);

        }

    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second]= temp;
    }

    private static int getmaxindex(int[] arr, int start, int end) {
        int max= start;
        for (int i = start; i <= end ; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
