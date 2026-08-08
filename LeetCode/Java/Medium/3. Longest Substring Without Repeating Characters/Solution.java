class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int maxlen=0;
        // for(int i=0;i<s.length();i++){
        //     int[] hash=new int[256];
        //     for(int j=i;j<s.length();j++){
        //         char ch=s.charAt(j);
        //      if(hash[ch]==1){
        //         break;
        //      }
        //         int len=j-i+1;
        //         maxlen=Math.max(len,maxlen);
        //         hash[ch]=1;

        //     }
        // }
        // return maxlen;

        int r=0,l=0,max=0;
        int hash[]=new int[256];
        Arrays.fill(hash,-1);
       while(r<s.length()){
            if(hash[s.charAt(r)]>=l){
                l=hash[s.charAt(r)]+1;
            }
            hash[s.charAt(r)]=r;
        
        int len=r-l+1;
        max=Math.max(len,max);
        r++;
    }
    return max;
    }
}
