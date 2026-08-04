class Solution {
    public int minimumLength(String s) {
        int l=0,r=s.length()-1;
        while(l<r && s.charAt(l)==s.charAt(r)){
            while((r-l)>0 && s.charAt(l)==s.charAt(l+1)){
                    l++;
            }
            while((r-l)>0 && s.charAt(r)==s.charAt(r-1)){
                    r--;
            }
            l++;
            r--;
        }
        return (l>r)?(0):(r-l+1);
    }
}