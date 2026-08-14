class Solution {
    public String simplifyPath(String path) {
        String [] arr = path.split("/");
        StringBuilder sb = new StringBuilder("/");
        Deque<String> st = new ArrayDeque<>();
        for(String x : arr){
            if(!st.isEmpty() && x.equals("..")){
                st.pop();
                continue;
            }else if(x.equals(".") || x.length()==0 || x.equals("..")){continue;}
            else{
                st.push(x);
            }
        }
        while(!st.isEmpty()){
            sb = sb.append(st.removeLast());
            if(!st.isEmpty()) sb = sb.append("/");
        }
        // sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}