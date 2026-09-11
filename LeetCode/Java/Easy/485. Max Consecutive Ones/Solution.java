class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

int n=nums.length;
int max=0;
int maxcount=0;
int j=0;

while(j<n){
    if(nums[j]==1){
        maxcount++;
    }else{
        max=Math.max(maxcount,max);
        maxcount=0;

    }
    j++;
}
return Math.max(max,maxcount);
    }
}