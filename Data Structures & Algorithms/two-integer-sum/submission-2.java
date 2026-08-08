class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ans = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int req = target -nums[i];
            if(ans.containsKey(req)){
                return new int[]{ans.get(req),i};
            }

            ans.put(nums[i],i);
        }
        return new int[]{};
        
        
    }
}
