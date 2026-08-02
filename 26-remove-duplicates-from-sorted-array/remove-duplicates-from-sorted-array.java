class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1,l=0,r=0;
        for(r=0;r<nums.length;r++){
            if(nums[r]>nums[l]){
                l++;
                nums[l]=nums[r];
                
            }            
        }
        return l+1;
    }
}