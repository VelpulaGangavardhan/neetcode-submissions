class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.isEmpty()){
                hm.put(nums[i],i);
            }else{
                int diff=target-nums[i];
                if(hm.getOrDefault(diff,-1)!=-1){
                    return new int[]{hm.get(diff),i};
                }
                hm.put(nums[i],i);

            }
        }
        return new int[]{-1,-1};
    }
}
