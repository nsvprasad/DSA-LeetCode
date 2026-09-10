class Solution {
    public int trap(int[] height) {
  int n=height.length;
    int total =0;
    int left=0,right=n-1;
    int leftmax=height[left];
    int rightmax=height[right];

    while(left<right){
        if(leftmax<rightmax){
            left++;
            leftmax=Math.max(leftmax,height[left]);
            total+=leftmax-height[left];
        }else{
            right--;
            rightmax=Math.max(rightmax,height[right]);
            total+=rightmax-height[right];

        }

    }
    return total;
    }
  

}