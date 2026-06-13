class Solution {
    public int search(int[] nums, int target) {
        // Given array is sorted
        // hint :- is to use Binary search
        int n = nums.length;
        int l = 0;
        int r = n - 1;

        while(l <= r){
            int mid = l + (r - l)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return -1;
    }
}
