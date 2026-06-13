class Solution {
    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int ans = -1;
        while(l <= r){
            int mid = l + (r - l) / 2;

            long sqrt = (long)mid * mid;
            if(sqrt <= x){
                ans = mid;
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return ans;
    }
}