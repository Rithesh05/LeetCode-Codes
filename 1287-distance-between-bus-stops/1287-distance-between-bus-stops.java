class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if(start>destination){
            int temp=start;
            start=destination;
            destination=temp;
        }
        int front=0;
        int back=0;
        for(int i=start;i<destination;i++){
            front=front+distance[i];
        }
        for(int i=destination;i<distance.length;i++){
            back=back+distance[i];
        }
        for(int i=0;i<start;i++){
            back=back+distance[i];
        }
        return Math.min(front,back);
    }
}