class Solution {

    public int evalRPN(String[] tokens) {
        Deque<Integer> st = new ArrayDeque<>();
        int a=0,b=0;
        for(String s : tokens){
            switch(s){
                case "+":
                    a=st.pop();
                    b=st.pop();
                    st.push(a+b);
                    break;
                case "-":
                    a=st.pop();
                    b=st.pop();
                    st.push(b-a);
                    break;
                case "*":
                    a=st.pop();
                    b=st.pop();
                    st.push(a*b);
                    break;
                case "/":
                    a=st.pop();
                    b=st.pop();
                    st.push(b/a);
                    break;
                default :
                    st.push(Integer.parseInt(s));
            }
        }
        return st.peek();
    }
}