class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
       int goodPairs = 0;

        for (int n : map.values()) {    
                 goodPairs += (n * (n - 1)) / 2;
            }

        return goodPairs;

    }
}