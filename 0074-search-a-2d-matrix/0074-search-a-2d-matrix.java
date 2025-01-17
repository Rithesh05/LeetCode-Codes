class Solution {
    public boolean binarysearch(int arr[],int target){
        int l=0;
        int mid;
        int h=arr.length-1;
        while(l<=h){
            mid=(l+h)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[mid]<target){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] arr, int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]<=target && arr[i][arr[i].length-1]>=target){
                return binarysearch(arr[i],target);
            }
        }
        return false;
    }
}