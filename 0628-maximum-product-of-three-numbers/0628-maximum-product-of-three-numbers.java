class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int val=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int re=nums[0]*nums[1]*nums[nums.length-1];
        if(val>re)return val;
        return re;
    
    }
}