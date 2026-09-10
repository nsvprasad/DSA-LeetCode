class Solution {
    public int maxArea(int[] nums) {
        int n=nums.length;
        int max=0;
        int l=0,r=n-1;

        while(l<r){
           int mh=Math.min(nums[l],nums[r]);
           int width=r-l;
           int area=mh*width;
           max=Math.max(max,area);

        
        if(nums[l]<=nums[r]){
            l++;
        }
        else{
            r--;
        }
        }
        return max;
    
    }
}

