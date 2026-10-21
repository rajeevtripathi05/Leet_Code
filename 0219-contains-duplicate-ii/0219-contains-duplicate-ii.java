class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        int j = i + k;
        HashSet <Integer> set = new HashSet<>();
        for (int index = 0; index <= j && index < nums.length; index++){
            if(set.contains(nums[index])){
                return true;
            }
            else set.add(nums[index]);
        }
        j = Math.min(j + 1, nums.length);
        for(; j<nums.length; j++){
            set.remove(nums[i]);
            if(set.contains(nums[j])){
                return true;
            }
            else set.add(nums[j]);
            i++;
        }
        return false;
        }
    }
