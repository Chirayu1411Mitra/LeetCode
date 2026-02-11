public class ClosestPerson {
    static int closest(int x,int y,int z){
        int t1=z-x;
        int t2=Math.abs(z-y);
        if(t1<t2) return 1;
        if(t1>t2) return 2;
        return 0;
    }

    public static void main(String[] args) {
        int temp=closest(2,7,4);
        System.out.println(temp);
    }
}
