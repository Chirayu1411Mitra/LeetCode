import java.util.*;

public class lc504 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        int n=-100;
        boolean isneg=false;
        if(n<0){
            isneg=true;
        }
        recur(Math.abs(n),sb);
        if(isneg){
        sb.insert(0,'-');
        }
        System.out.println(sb.toString());


    }
    static void recur(int n,StringBuilder sb){
        if(n==0) return;
        sb.append(n%7);
         recur(n/7,sb);
    }


}
