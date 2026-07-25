class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] ans=new int[nums.length];
        int left=0,right=ans.length-1;
        int i=ans.length-1;
        while(left<=right){
        if(Math.abs(nums[right])>Math.abs(nums[left])){
            ans[i]=nums[right]*nums[right];
            right--;
            i--;
        }
        else{
            ans[i]=nums[left]*nums[left];
            left++;
            i--;
        }
        }
        return ans;
    }
}