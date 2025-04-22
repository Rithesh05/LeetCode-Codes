package RESURSIONA2ZBASICS;

public class revarray {
    public static void revarr(int[] arr,int i){
        if(i<0){
            return;
        }
        System.out.println(arr[i]+" ");
        revarr(arr, i-1);
    }
    public static void main(String[] args) {
        revarr(new int[]{1,2,3,4},new int[]{1,2,3,4}.length-1);
    }
}
