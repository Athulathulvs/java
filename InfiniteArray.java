//Amazon Question
// Find position of an element in an  infinate sorted array
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170,180,181,182,183,184,185,186,187,188,189,190};
        int target=100;
        System.out.println(ans(arr, target));

    }
    static int ans(int[] arr,int target){
        int start= 0;
        int end= 1;
        while(target>arr[end]){
            int temp=end + 1;
            end = end +( end - start + 1) * 2;
            start=temp;
        }
//        while (target > arr[end]) {
//            start = end;
//            end = end * 2;
//        }
        return binarysearch(arr,target ,start,end);
    }
    static int binarysearch(int[] arr,int target, int start, int end){
        while(start<=end){
            int mid= start + (end-start)/2;
            if(target>arr[mid]){
                start=mid + 1;
            } else if (target<arr[mid]) {
                end=mid - 1;

            }else{
                return mid;
            }
        }
        return -1;
    }
}
