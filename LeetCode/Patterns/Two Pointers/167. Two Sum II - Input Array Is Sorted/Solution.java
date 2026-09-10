class Solution {
    public int[] twoSum(int[] num, int target) {
        int ans[]={-1,-1};
        int left=0;
        int right=num.length-1;
        while(left<right){
            int sum=num[left]+num[right];
            if(sum==target){
                ans[0]=left+1;
                ans[1]=right+1;
                return ans;
            }
                else if(sum>target){
                    right--;

                }else{
                    left++;

                }
            }
        
        return ans;
}
}