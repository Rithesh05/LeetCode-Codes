package RESURSIONA2ZBASICS;

public class ispalindrome {
    public static boolean palindrome(String s) {
        return ispal(s,0,s.length()-1);
     }
     public static boolean ispal(String s,int i,int j){
         if(i>j){
             return true;
         }
         return s.charAt(i)==s.charAt(j) && ispal(s,i+1,j-1);
     }
     public static void main(String[] args) {
        System.out.println(palindrome("camac"));
     }
}
