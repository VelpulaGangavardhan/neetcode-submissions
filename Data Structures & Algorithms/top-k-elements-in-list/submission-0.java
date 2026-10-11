class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        ArrayList<Map.Entry<Integer,Integer>> al = new ArrayList<>(hm.entrySet());
        Collections.sort(al,(a,b)->b.getValue().compareTo(a.getValue()));
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i]=al.get(i).getKey();
        }
        // return new int[]{};
       return result;
        
    }
}
