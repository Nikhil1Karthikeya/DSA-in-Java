class Solution {
    public int[] twoSum(int[] nums, int target) {
        int need;
        int ans[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        need=target-nums[i];
        if(map.containsKey(need)){
        ans[0]=map.get(need);
        ans[1]=i;
        return ans;
        }
        else{
            map.put(nums[i],i);
        }
        }
return ans;
    }
}