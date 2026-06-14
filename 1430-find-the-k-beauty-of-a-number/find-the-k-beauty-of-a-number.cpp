class Solution {
public:
    int divisorSubstrings(int num, int k) {
        string s= to_string(num);
        int n=s.size();
        int x= pow(10,k-1);
        int c=0,l=0,r=0,div=0;
        while(r<n){
            // int digit = rev%10;
            // rev/=10;
            //now use this digit to do the same work, this approach uses O(1) space
            div= div*10+((s[r]-'0'));
            if(r-l+1==k){
                if(div!=0 && num%div==0) c++;
                div=div-((s[l]-'0')*x);
                l++;
            }
            r++;
        }
        return c;
    }
};