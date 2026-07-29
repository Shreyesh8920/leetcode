class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Map<Integer,Integer> freq = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int rem = target - nums[i];
            arr[0]=i;
            if(freq.getOrDefault(rem,-1)!=-1){
                arr[1]=freq.get(rem);
                break;
            }else{
                freq.put(nums[i],i);
            }
        }


        return arr;
    }
}