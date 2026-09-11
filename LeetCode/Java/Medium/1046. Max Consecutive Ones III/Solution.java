class Solution {
    public int longestOnes(int[] nums, int k) {
           int n=nums.length;
           int zerocount=0;
           int left=0;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zerocount++;

            }if(zerocount>k){
                if(nums[left]==0){
                    zerocount--;
                }
                left++;
            }
        }
        return n-left;

        }
    }
