class Solution {
public:
    void sortColors(vector<int>& nums) {
        // int n0=0,n1=0,n2=0;
        // for(int ele: nums){
        //     if(ele==0) n0++;
        //     if(ele==1) n1++;
        //     if(ele==2) n2++;
        // }
        // for(int i=0;i<nums.size();i++){
        //     if(i<n0){
        //         nums[i]=0;
        //     }else if(i>=n0 && i<n1+n0){
        //         nums[i]=1;
        //     }else if(i>=n1 && i<nums.size()){
        //         nums[i]=2;
        //     }
        // }

        //-----dutch national flag-----
        int l=0,r=nums.size()-1,mid=0;
        while(mid<=r){
            if(nums[mid]==0){
                swap(nums[mid],nums[l]);
                l++;
                mid++;
            }else if(nums[mid]==2){
                swap(nums[mid],nums[r]);
                r--;
            }else{
                mid++;
            }
        }
    }
};