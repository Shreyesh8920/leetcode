class Solution {
    public boolean isPalindrome(String s) {
        int l=0,r=s.length()-1;
        while(l<r){
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(r))){
                r--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(r))!=Character.toLowerCase(s.charAt(l))) return false;
            l++;
            r--;
        }
        return true;
    }
}