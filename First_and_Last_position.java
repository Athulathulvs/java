public class First_and_Last_position {
    public static void main(String [] args){
        int[] nums = {1, 1, 2, 7, 7, 7, 7, 8, 8, 9};
        int target = 7;
        FirstAndLastPosition obj = new FirstAndLastPosition();
        int[] result = obj.searchRange(nums, target);
        System.out.println("First occurrence: " + result[0]);
        System.out.println("Last occurrence: " + result[1]);

    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans= { - 1, - 1};
        ans[0]=search(nums, target,true);
        ans[1]=search(nums, target,false);
        return ans;

    }
    int search(int [] nums,int target,boolean findStartIndex){
        int ans= -1;
        int start=0;
        int end= nums.length - 1;
        while(start<=end){
            int mid= start + (end-start)/2;
            if(target>nums[mid]){
                start=mid + 1;
            } else if (target<nums[mid]) {
                end=mid - 1;

            }else{
                ans=mid;
                if (findStartIndex){
                   end = mid -1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
