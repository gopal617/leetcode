class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)-> Integer.compare(a[1],b[1]));
        int ele=points[0][1];
        int c=0;
        for(int i=1;i<points.length;i++){
            if(ele<points[i][0]){
                ele=points[i][1];
                c+=1;
            }
        }
        return c+1;
    }
}