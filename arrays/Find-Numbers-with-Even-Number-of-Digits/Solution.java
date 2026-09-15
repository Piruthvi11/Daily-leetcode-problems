class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i]; // store the number in  num variable 
            String s=String.valueOf(num); //  convert the num in to string  eg= "12"
            if(s.length()%2==0)
            {
                count++;
            }
        }
        return count;
        
    }
}
