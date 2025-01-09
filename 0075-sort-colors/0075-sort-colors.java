class Solution {
    public static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public void sortColors(int[] a) {
        int l=0;
        int mid=0;
        int h=a.length-1;
        while(mid<=h){
            if(a[mid]==0){
                swap(a,l,mid);
                l++;
                mid++;
            }else if(a[mid]==1){
                mid++;
            }
            else{
                swap(a,mid,h);
                h--;
            }
        }
    }
}