class Solution {
    public void rotate(int[][] matrix) {
        //transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<=i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int[] temp:matrix){
            //rotation
            int start=0;
            int end=temp.length-1;
            while(start<end){
                int t1=temp[start];
                temp[start]=temp[end];
                temp[end]=t1;
                start++;
                end--;
            }
        }
    }
}