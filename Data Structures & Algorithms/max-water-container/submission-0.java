class Solution {
    public int maxArea(int[] heights) {

        int left =0;
        int right=heights.length-1;
        int maxWater=0;
        while(left<right){
            int h1=heights[left];
            int h2=heights[right];
            int dis=right-left;
            maxWater=Math.max(maxWater,(dis*Math.min(h1,h2)));
            if(h1>h2){
                right--;
            }else{
                left++;
            }
        }

        return maxWater;
        
    }
}
