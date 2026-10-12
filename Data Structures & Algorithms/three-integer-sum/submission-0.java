class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        HashSet<List<Integer>> hs = new HashSet<>();
       Arrays.sort(nums);
        int n= nums.length;
        for(int i=0;i<n;i++){
            int t=nums[i];
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum = nums[j]+nums[k]+t;
                if(sum==0){
                    List<Integer> l = new ArrayList<>(List.of(nums[i],nums[j],nums[k]));
                    hs.add(l);
                    j++;
                    k--;
                }else if(sum>0){
                    k--;
                }else{
                    j++;
                }
                
            }

        }
        return new ArrayList<>(hs);
    }
}
