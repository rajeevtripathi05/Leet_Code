class Solution {
    public int numberOfSteps(int num) {
        return helper(num, 0);
    }
    public int helper(int i, int count) {
        if(i ==0){
            return count;
        }
        if(i%2==1){
            return helper(i-1, count+1);
        }
        return helper(i/2, count+1);

    }
}