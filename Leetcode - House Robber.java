// https://leetcode.com/problems/house-robber/
class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        dp[0]=0;
        dp[1]=nums[0];
        if(nums.length==1)
            return dp[1];
        for(int i=2;i<dp.length;i++)
        {
            dp[i]=Math.max(dp[i-1],nums[i-1]+dp[i-2]);
            //System.out.println(dp[i]);
        }
        return dp[dp.length-1];
        //return 0;
    }
}
