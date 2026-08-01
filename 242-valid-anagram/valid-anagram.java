class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(char x : s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(char x : t.toCharArray()){
            int i = map.getOrDefault(x,0);
            if(i==0){return false;}
            map.put(x,i-1);
        }
        int c=0;
        for(int x : map.values()){
            c+=x;
        }

        return (c==0);
    }
}