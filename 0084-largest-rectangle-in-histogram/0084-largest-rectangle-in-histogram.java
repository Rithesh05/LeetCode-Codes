class Solution {
    public static int[] PSE(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(stack.isEmpty()){
                ans[i]=-1;
            }else{
                while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    ans[i]=-1;
                }else{
                    ans[i]=stack.peek();
                }
                
            }
            stack.push(i);
        }
        return ans;
    }
    public static int[] NSE(int[] arr){
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            if(stack.isEmpty()){
                ans[i]=arr.length;
            }else{
                while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    ans[i]=arr.length;
                }else{
                    ans[i]=stack.peek();
                }
            }
            stack.push(i);
        }
        return ans;
    }
    public int largestRectangleArea(int[] heights) {
        int[] nse=NSE(heights);
        int[] pse=PSE(heights);
        for(int i=0;i<heights.length;i++){
            System.out.print(nse[i]+" ");
        }
        System.out.println();
        for(int i=0;i<heights.length;i++){
            System.out.print(pse[i]+" ");
        }
        int max=0;
        for(int i=0;i<heights.length;i++){
            max=Math.max((nse[i]-pse[i]-1)*heights[i],max);
        }
        return max;

    }
}