class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
int n=nums.length;
int maxcount=0;
int currentcount=0;
int j=0;
while(j<n){
    if(nums[j]==1){
        currentcount++;

    }else{
        maxcount=Math.max(currentcount,maxcount);
        currentcount=0;

    }
    j++;
}
return Math.max(currentcount,maxcount);
    }
}