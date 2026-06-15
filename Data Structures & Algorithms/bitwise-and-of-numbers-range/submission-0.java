class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        long ans = left;
        for(long i=left+1;i<=right;i++){
            ans &= i;
            if(ans == 0){
                return 0;
            }
        }
        return (int)ans;
    }
}