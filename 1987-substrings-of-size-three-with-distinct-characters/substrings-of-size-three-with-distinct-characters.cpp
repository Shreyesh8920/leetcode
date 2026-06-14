class Solution {
public:
    int countGoodSubstrings(string s) {
        int n=s.size(),l=0,r=0,dis=0,res=0;
        unordered_map<char,int> freq;

        while(r<n){
             freq[s[r]]++;
             if(freq[s[r]]==1) dis++;
             if(r-l+1==3){
                if(dis==3) res++;
                freq[s[l]]--;
                if(freq[s[l]]==0) dis--;
                l++;
             }
             r++;
        }
        return res;
    }
};