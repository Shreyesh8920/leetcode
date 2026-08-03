class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 2,r=2,n=nums.length;
        if(n<2) return n; 
        for(r=2;r<n;r++){
            if(nums[r]>nums[l-2]){
                nums[l]=nums[r];
                l++;
            }
        }
        return l;
    }
/*
Build the answer inside the same array. The answer is always kept valid, meaning every element appears at most twice. For every new element, compare it with the element at l-2. If they are different, accept the current element because it will not create a third occurrence. If they are the same, reject it because two copies already exist in the answer.
*/
}