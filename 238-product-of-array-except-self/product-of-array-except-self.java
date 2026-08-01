class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] arr = new int[n];
        arr[0]=1;

        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]*nums[i-1];
        }
        
        int temp = nums[n-1];
        nums[n-1]=1;
        arr[n-1] *= nums[n-1];
        for(int i=n-2;i>=0;i--){
            int res=temp*nums[i+1];
            temp = nums[i];
            nums[i]=res;
            arr[i]*=nums[i];
        }
        return arr;
    }
}