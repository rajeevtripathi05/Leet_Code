class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];

        result[0] = 1;
        for(int i = 1; i<length; i ++){
            result[i] = result[i-1]* nums[i-1];
        }

    int rightPro= 1;
    for(int r = length -1; r>= 0; r--){
        result[r] = result[r]*rightPro;
        rightPro *= nums[r];
    }
        
     return result;   
    }
}