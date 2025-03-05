class Solution {
    public long coloredCells(int n) {
        long total=2*n;
        long sum=total-1;
        long tobeprod=0;
        sum=sum-2;
        while(sum>=1){
            tobeprod=tobeprod+sum;
            sum=sum-2;
        }
        return total-1+2*tobeprod;

    }
}