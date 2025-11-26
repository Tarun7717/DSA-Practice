class Solution {
    public boolean hasDuplicate(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(nums[i]==nums[j])
                return true;
            }
            
        }
        return false;
    }
    
}
