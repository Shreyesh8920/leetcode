class Solution {
    public void addRest(String s,StringBuilder sb,int l){
        for(;l<s.length();l++){
            sb.append(s.charAt(l));
        }
    }
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb =  new StringBuilder();
        int l1=0,l2=0;
        while(l1<word1.length() && l2<word2.length()){
            sb.append(word1.charAt(l1));
            sb.append(word2.charAt(l2));
            l1++;
            l2++;
        }
        if(l1<word1.length()){
            addRest(word1,sb,l1);
        }
        else if(l2<word2.length()){
            addRest(word2,sb,l2);
        }

    return sb.toString();
    }
}