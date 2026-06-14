class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        vector<vector<int>> res(nums.size()+1);
        //using frequency bucket approach
        
        unordered_map<int,int> smap;
        for(auto i : nums){
            smap[i]++;
        }
        for(auto i=smap.begin();i!=smap.end();i++){
            res[(*i).second].push_back((*i).first);
        }
        for(int i=res.size()-1;i>0;i--){
            if(res[i].size()!=0 && res[0].size()<k){
                for(auto j:res[i]){
                    res[0].push_back(j);
                }
            }
            if(res[0].size()>=k){
                
                break;
            }
            
        }
    return res[0];
    }
};
/*
Algorithm (Bucket Sort Approach)

Input: Array nums and integer k

1. Count the frequency of each element.
Traverse nums and store the frequency of every number in a hash map.
After this step, each element is mapped to the number of times it appears.
2. Create frequency buckets.
Create a vector of vectors bucket of size n + 1, where n = nums.size().
Index i of the bucket represents frequency i.
3. Place elements into their corresponding buckets.
Traverse the hash map.
If an element appears f times, insert it into bucket[f].
Now, every bucket contains all elements having the same frequency.
4. Traverse buckets from highest frequency to lowest.
Start from index n and move towards 1.
The first non-empty buckets contain the most frequent elements.
5. Collect the top k frequent elements.
Add all elements from the current bucket into the answer.
Stop once the answer contains at least k elements.
6. Return the answer. */