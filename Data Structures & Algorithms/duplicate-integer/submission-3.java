class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean isDuplicate = false;
        HashSet<Integer> result = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(!result.add(nums[i])) isDuplicate = true;
        }
        return isDuplicate;
    }
}