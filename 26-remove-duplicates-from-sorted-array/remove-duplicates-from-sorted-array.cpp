class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int n = nums.size(),l=0,r=1,c=1;
        if(n==1) return 1;
        while(r<n){
            while(r<n && nums[l]==nums[r]){
                r++;
            }
            if(r<n){
                l++;
                nums[l]=nums[r]; 
                r++;
                c++;
            }
        }
        return c;
    }
};