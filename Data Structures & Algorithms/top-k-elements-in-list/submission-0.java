class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
        };

        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>(freq.entrySet());
        int[] arr = new int[k];

        list.sort((a,b)-> b.getValue()- a.getValue());

        for(int i = 0;i<arr.length;i++){
            arr[i]=list.get(i).getKey();
        }

        return arr;
        
    }
}
