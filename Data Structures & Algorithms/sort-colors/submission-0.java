class Solution {
    public void swap(int[] nums,int left,int right){
        int temp= nums[left];
        nums[left] = nums[right];
        nums[right]= temp;
    }
    public void sortColors(int[] nums) {
        int i=0, j=nums.length-1;
        int k=0;

        while(k<=j){
            if(nums[k]==0){
                swap(nums,i,k);
                i++;
                k++;
            }else if(nums[k]==1){
                k++;
            }else{
                swap(nums,k,j);
                j--;
            }
        }
        
    }
}