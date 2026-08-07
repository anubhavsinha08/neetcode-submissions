class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(freq.containsKey(nums[i])) return true;

            freq.put(nums[i],i);
        }
        return false;
        
    }
}