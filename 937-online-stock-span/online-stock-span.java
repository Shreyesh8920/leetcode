/*
Maintain a monotonic decreasing stack of (price, span) pairs. For every new price, start its span from 1, then pop all smaller prices. Instead of counting popped elements one by one, add their already-computed spans, because each popped element represents an entire group of previous days that it has already covered. After all smaller prices are removed, push the current (price, totalSpan) onto the stack.
*/
class StockSpanner {
    private Deque<int[]> st;
    private int span = 0;
    public StockSpanner() {
        st = new ArrayDeque<>();
    }
    
    public int next(int price) {
        span=1;
        if(st.isEmpty() || price<st.peek()[0]){
            st.push(new int[]{price,1});
            return 1;
        }

        
        while(!st.isEmpty() && price >= st.peek()[0]){
            span+=st.pop()[1];
        }
        
        st.push(new int[]{price,span});
       
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */