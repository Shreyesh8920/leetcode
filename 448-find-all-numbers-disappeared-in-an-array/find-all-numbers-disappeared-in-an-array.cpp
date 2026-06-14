class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        vector<int> res(nums.size()+1,0);
        //using extra space i.e hashmap
        // unordered_map<int,int> smap;
        // for(auto i : nums){
        //     smap[i]++;
        // }
        // for(auto i=1;i<=nums.size();i++){
        //     if(smap[i]==0){
        //         res.push_back(i);
        //     }
        // }

        //without using extra space
        for(int i: nums){
            res[i]=i;
        }
        int s=nums.size()+1;
        nums.clear();
        for(int i=1;i<s;i++){
            if(res[i]==0){
                nums.push_back(i);
            }
        }
        return nums;
    }
};


