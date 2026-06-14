class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0) return false;
        int temp=x;
        long long res=0;
        while(x>0){
            res*=10;
            res+=x%10;
            x=x/10;
        }
        return(res==temp)?(true):(false);
    }
};