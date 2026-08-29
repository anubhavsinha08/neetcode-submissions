class Solution {
    public int maxArea(int[] heights) {
        int i=0, j=heights.length-1;
        int water=0;

        while(i<j){
            water = Math.max(water, Math.min(heights[i],heights[j]) *(j-i));
            if(heights[i]<=heights[j])i++;
            else{
                j--;
            }
        }
        return water;
    }
}
