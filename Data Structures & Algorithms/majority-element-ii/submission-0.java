class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list = new ArrayList<>();

        int len = nums.length / 3;
        for(int num : map.keySet()){
            if(map.get(num) > len){
                list.add(num);
            }
        }
        return list;
    }
}