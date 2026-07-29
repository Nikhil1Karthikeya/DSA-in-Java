class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
         ArrayList<int[]> list = new ArrayList<>();
         if (intervals.length == 0) {
            return new int[0][];
        }
        //sorting;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        //merging the intervals
    int start=intervals[0][0];
    int end=intervals[0][1];
    for(int i=1;i<intervals.length;i++){
    if(intervals[i][0]<=end){
    end=Math.max(end,intervals[i][1]);
    }
    else{
       list.add(new int[]{start, end});
       start=intervals[i][0];
       end=intervals[i][1];
    }
    }
    list.add(new int[]{start,end});
    return list.toArray(new int[list.size()][]);
    }
}