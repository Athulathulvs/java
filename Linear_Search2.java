public class Linear_Search2 {
    public static void main(String[] args) {
        int[] nums={23,45,1,2,8,19,-3,16,-11,28};
        int target=-11;
        int ans=linearsearch(nums,target);
        System.out.println("The searched element "+target+ " is at index: " +ans);

    }
    static int linearsearch(int[] arr,int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }


//    //search the elements and return the elements
//    static int linearsearch2(int[] arr,int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//        for (int element : arr) {
//            if (element == target) {
//                return element;
//            }
//        }
//        return -1;
//    }

}
