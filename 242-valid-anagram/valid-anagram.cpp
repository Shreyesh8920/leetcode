class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.size()!=t.size()) return false;
        unordered_map<char,int> smap;
        int count=0;
        for(auto it:s){
            smap[it]++;
            count++;
        }
        for(auto it:t){
            if(smap.find(it)!=smap.end() && count!=0){
                if(smap[it]>0){
                    smap[it]--;
                    count--;
                }
            }
        }
        return (count==0);  
    }
};