class Solution {
    public int removeElement(int[] nums, int val) {
        int l=0,r=0;
        for(r=0;r<nums.length;r++){
            if(nums[r]!=val){
                nums[l]=nums[r];
                l++;
            }
        }

        return l;
    }
}
/*
        for(r=0;r<nums.length;r++){
            
            if(nums[l]==val && nums[r]!=val){
                int temp = nums[l];
                nums[l]=nums[r];
                nums[r]=temp;

            }
            if(!(nums[l]==val)&& l<nums.length){l++;}

            
        }
 */