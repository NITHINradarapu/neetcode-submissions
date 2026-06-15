class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int idxXor = 0;
        for(int i=0;i<=n;i++){
            idxXor ^= i;
        }

        int valXor = 0;
        for(int num : nums){
            valXor ^= num;
        }

        return idxXor ^ valXor;
    }
}
