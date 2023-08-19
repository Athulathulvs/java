public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={-12,-11,-2,0,1,3,5,21,22,34,55,78};
        int target=55;
        int ans=binarysearch(arr,target);
        System.out.println(target+" element at index: "+ans);
    }
    static int binarysearch(int[] arr,int target){
        int start=0;
        int end= arr.length - 1;
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
