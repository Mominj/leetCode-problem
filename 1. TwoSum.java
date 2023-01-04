class Solution {
    public int[] twoSum(int[] nums, int target) {
           Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();


        for (int i=0; i<nums.length; i++) {
            int t = target - nums[i];
            if(hashMap.containsKey(t) ) {

                int n = hashMap.get(t);
                return new int[] {n,i};
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }
}