/*
Traverse the array left to right and maintain a monotonic decreasing stack of indices representing days whose warmer day has not been found yet. For each current temperature, pop all previous indices whose temperature is smaller than the current one; the current index is their first warmer day, so set ans[prev] = i - prev. After resolving all such days, push the current index into the stack.

Core idea: Current day resolves all previous smaller unresolved days → calculate their distance → push current day.
*/ 
/*
public int[] dailyTemperatures(int[] t) {
    int n = t.length;
    int[] ans = new int[n];
    Deque<Integer> st = new ArrayDeque<>();

    for (int i = n - 1; i >= 0; i--) {

        while (!st.isEmpty() && t[st.peek()] <= t[i]) {
            st.pop();
        }

        if (!st.isEmpty()) {
            ans[i] = st.peek() - i;
        }

        st.push(i);
    }

    return ans;
}
 */
class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] ans = new int[t.length];
        Deque<Integer> st = new ArrayDeque<>();
        for(int i = 0;i<t.length;i++){
            while(!st.isEmpty() && t[i]>t[st.peek()]){
                int prev = st.pop();
                ans[prev]=i-prev;
            }
            st.push(i);
        }
        return ans;
    }
}