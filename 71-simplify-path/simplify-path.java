class Solution {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder("/");
        Deque<String> st = new ArrayDeque<>();
        for(String x : path.split("/")){
            if(!st.isEmpty() && x.equals("..")){
                st.pop();
                continue;
            }else if(x.equals(".") || x.length()==0 || x.equals("..")){
                continue;
            }else{
                st.push(x);
            }
        }
        while(!st.isEmpty()){
            sb.append(st.removeLast());
            if(!st.isEmpty()) sb = sb.append("/");
        }
        return sb.toString();
    }
}