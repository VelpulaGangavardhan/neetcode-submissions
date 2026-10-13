class Solution {
    public int search(int[] nums, int target) {
        if(nums.length ==1 && nums[0]==target){
            return 0;
        }
        if(nums.length == 1){
            return -1;
        }
        int left =0;
        int right=nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            int num = nums[mid];
            if(num==target){
                return mid;
            }else if(num>target){
                right--;
            }else{
                left++;
            }
        }
        return -1;
        
    }
}
