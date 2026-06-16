class Solution {
    public int compress(char[] chars) {
        int rIdx = 0;
        int wIdx = 0;

        while(rIdx < chars.length){
            char curr = chars[rIdx];
            int count = 0;

            while(rIdx < chars.length && curr == chars[rIdx]){
                rIdx++;
                count++;
            }

            chars[wIdx] = curr;
            wIdx++;
            if(count > 1){
                String strC = String.valueOf(count);
                for(char c : strC.toCharArray()){
                    chars[wIdx] = c;
                    wIdx++;
                }
            }
        }
        return wIdx;
    }
}