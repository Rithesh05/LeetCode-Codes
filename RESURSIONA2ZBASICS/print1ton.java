package RESURSIONA2ZBASICS;

public class print1ton {
    public static void print(int start,int end){
        if(start>end){
            return;
        }
        System.out.println(start);
        print(start+1, end);

    }
    public static void main(String[] args) {
        print(0,5);
    }
}
