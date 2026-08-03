class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int l=0,r=nums.length-1;
        while(l<r){
            if(nums[l]+nums[r]==target){
                ans[0]=l+1;
                ans[1]=r+1;
                l=r;//just to break the condition
            }else if(nums[l]+nums[r]>target){
                r--;
            }else{
                l++;
            }
        }
        return ans;
    }
}