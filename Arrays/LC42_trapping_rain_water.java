class Solution {
    public int trap(int[] height) {
        int totalwater=0;
        int n = height.length;
        int []leftmax=new int[n];
        int []rightmax=new int[n];
        leftmax[0]=height[0];
       rightmax[n-1]=height[n-1];
        //leftmax array;
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        //rightmax
         for (int i = n - 2; i >= 0; i--) {
    rightmax[i] = Math.max(rightmax[i + 1], height[i]);
}
        for(int i=1;i<n-1;i++){
        int water=Math.min(leftmax[i],rightmax[i])-height[i];
        if(water>0){
            totalwater+=water;
        }
        }
return totalwater;
    }
}