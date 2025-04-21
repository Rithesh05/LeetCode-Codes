package RESURSIONA2ZBASICS;
//Print name N times using recursion
public class recursiontwoa2z {
    public static void print(String str,int count){
        if(count==0){
            return;
        }
        System.out.println(str);
        count=count-1;
        print(str, count);
    }
    public static void main(String[] args){
        print("Satwik bot",4);
    }
}
