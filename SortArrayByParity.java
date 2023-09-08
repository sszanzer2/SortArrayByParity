class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int x=0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                result[x] = nums[i];
                x++;
            }
        }
         for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 1) {
                result[x] = nums[i];
                x++;
            }
        }
        return result;
        
    }
}
