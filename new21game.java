public class new21game {
    public static void main(String[] args) {
        double d= newgame(21,17,10);
        System.out.println(d);
    }
    static double newgame(int n , int k , int maxpts){
        int points=0;
        double prob=0;
        while(points<k && k==1){
            if(n>maxpts){
                return 1.0000;
            }
            else{
                prob= (double) n /maxpts;
            }
            points++;
        }
        return prob;
    }
}
