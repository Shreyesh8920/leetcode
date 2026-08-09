class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> st = new ArrayDeque<>();
        for(int x : asteroids){
            if(st.isEmpty() || x>0){
                st.push(x);
                continue;
            }
            
            while(!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(x)){
                st.pop();
            }
            if(!st.isEmpty() && st.peek()>0){
                if(st.peek()>Math.abs(x)){continue;} 
                else{
                    st.pop();
                    continue;
                }
            }
            st.push(x);
            
        }
        int[] ans = new int[st.size()];
        int i = 0;

        for (int x : st) {
            ans[st.size() - 1 - i++] = x;
        }

        return ans;
    }
}