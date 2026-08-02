class Solution {
    public boolean isAnagram(String s1, String s2, int[] arr){
        if(s1.length()!=s2.length()) return false;
        boolean empty = true;
        for(char x : s1.toCharArray()){
            arr[x-'a']++;
        }
        for(char x : s2.toCharArray()){
            arr[x-'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0) empty = false;
            arr[i]=0;
        }
        return empty;
    } 
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] arr = new int[26];
        int c=0;
        List<List<String>> ans = new ArrayList<>();
        boolean[] visited =  new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(visited[i]) continue;
            ans.add(new ArrayList<>());
            ans.get(c).add(strs[i]);
            for(int j=0;j<strs.length;j++){
                if(i==j) continue;
                visited[i]=true;
                if(isAnagram(strs[i],strs[j],arr)){
                    visited[j]=true;
                    ans.get(c).add(strs[j]);
                }

            }
            c++;
        }
        return ans;
    }
}