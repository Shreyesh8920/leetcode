class Solution {
// Compare characters using two pointers from both ends.
// If characters match, move both pointers inward.
// On the first mismatch, allow one deletion by checking:
// (1) skip the left character, or (2) skip the right character.
// If either remaining substring is a palindrome, return true.
    public boolean isPalindrome(String s, int l, int r){
        while(l<r){
            if(!(s.charAt(l)==s.charAt(r))) return false;
            l++;
            r--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int l=0,r=s.length()-1,c=0;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return isPalindrome(s,l+1,r) || isPalindrome(s,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }
}