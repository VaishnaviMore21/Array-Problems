class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[]frequency=new int[101];
        int maxFreq=0;
        int count=0;
        for(int num:nums)
        {
            frequency[num]++;
            if(frequency[num]>maxFreq)
            {
                maxFreq=frequency[num];
               count = frequency[num];
            }
            else if(frequency[num]==maxFreq)
            {
                 count += frequency[num];
            }
        }
        return count;
    }
}
