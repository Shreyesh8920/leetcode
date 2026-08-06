class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();

        for(char p : s.toCharArray()){
            
            if(p=='(' || p=='{' || p=='['){
                st.push(p);
            }else{
                if(st.isEmpty()) return false;
                char x = st.peek();
                if((x=='[' && p==']') || (x=='{' && p=='}') || (x=='(' && p==')')){
                    st.pop();
                }
                else{
                    st.push(p);
                }
            }
        }
        return st.isEmpty();
    }
}