import java.util.*;

public class kokoeatingbanana {
    static int minEatingSpeed(int[] piles, int h) {
        int res=0;
        Arrays.sort(piles);
        int start=0;
        int end=piles[piles.length-1];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(caneat(piles,mid,h)){
                res=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return res;

    }
    static boolean caneat(int[]piles , int n , int h ){
        long res = 0;
        for (int pile : piles) {
            res += (pile + n - 1) / n;
        }
        return res <= h;
    }

    public static void main(String[] args) {
     int[] arr={3,6,7,11};
     int res= minEatingSpeed(arr,8);
        System.out.println(res);
    }
}
