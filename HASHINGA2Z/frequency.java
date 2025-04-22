package HASHINGA2Z;
class frequency{
    public static void freqgive(int[] arr){
        boolean[] visted=new boolean[arr.length];
        int count;
        for(int i=0;i<arr.length;i++){
            count=1;
            if(visted[i]==true){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    visted[j]=true;
                    count++;
                }

            }
            System.out.println("count of "+arr[i]+" is "+count);
        }
    }
    public static void main(String[] args) {
        freqgive(new int[]{1,1,1,2,3,4,5,9,9});
    }
}