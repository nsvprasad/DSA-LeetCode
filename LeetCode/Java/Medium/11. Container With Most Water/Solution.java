class Solution {
    public int maxArea(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int max=0;
        while(left<right){
            int min=Math.min(nums[left],nums[right]);
            int width=right-left;
            int area=min*width;
            max=Math.max(area,max);
            if(nums[left]<=nums[right]){
                left++;

            }
            else{
                right--;
            }
        }
        return max;
    
    }
}

