class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> mono = new ArrayDeque<>();
        Map<Integer,Integer> nxt = new HashMap<>();
        for(int i = 0;i<nums2.length;i++){
            int x = nums2[i];
            if(mono.isEmpty()){
                mono.push(i);
                continue;
            }
            while(!mono.isEmpty() && nums2[mono.peek()]<x){
                int t = mono.pop();
                nxt.put(nums2[t],nums2[i]);
            }
            mono.push(i);
            
        }
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=nxt.getOrDefault(nums1[i],-1);
        }
        return ans;
    }
}