class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int m = (int)Math.ceil((double)n/2);
        int candidate = nums[0];
        int count = 0;
        for(int i = 0;i<n;i++){
            if(count == 0) candidate = nums[i];

            count += (nums[i]==candidate)?(1):(-1);
            
            if(count == m) break;

        }
        return candidate;
    }
}