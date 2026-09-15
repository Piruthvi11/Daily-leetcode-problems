class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result=new int[2*n]; // because  first input eg: there are 6 elements but they gave only n=3 so we multiplying the array * 2 .
        for(int i=0;i<n;i++)
        {
             result[2*i]= nums[i];
             result[2* i+1]= nums[i+n];
        }
        return result;
    }
}
