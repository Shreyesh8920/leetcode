class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        //can be also solved in space complexity O(1) , calculate prefix and store in result 
        //the calculate suffix and multiply to prefix using temp variable 
        vector<int> pref(nums.size());
        vector<int> res(nums.size());
        vector<int> suff(nums.size());
        pref[0]=nums[0];
        for(int i=1;i<nums.size();i++){
            pref[i]=(pref[i-1]*nums[i]);
        }
        suff[nums.size()-1]=nums[nums.size()-1];
        for(int i=nums.size()-2;i>=0;i--){
            suff[i]=(nums[i]*suff[i+1]);
        }
        for(int i=0;i<nums.size();i++){
            if(i==0){
                res[i]=(suff[i+1]);
            }else if(i==nums.size()-1){
                res[i]=(pref[i-1]);
            }else{
                res[i]=(pref[i-1]*suff[i+1]);
            }

            
        }

        return res;
    }
};