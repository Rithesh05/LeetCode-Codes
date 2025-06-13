class Solution {
    public int maximum69Number(int num) {
        int first = (num/1000)%10;
        int second = (num/100)%10;
        int third = (num/10)%10;
        int fourth = num%10;
   if(first==6)return 9 * 1000 + second * 100 + third * 10 + fourth;
   if(second==6)return first * 1000 + 9 * 100 + third * 10 + fourth;
   if(third==6)return first * 1000 + second * 100 + 9 * 10 + fourth;
   if(fourth==6)return first * 1000 + second * 100 + third * 10 + 9;
   return num;
 }
}