public class Buysellstock2 {
    static int Maxprofit(int [] price){
        int profit =0;
        for (int i=0;i<price.length-1;i++){
            if(price[i]>price[i+1]){
                int temp=price[i+1];

            }
            if(price[i]<price[i+1]){
                profit=profit+(price[i+1]-price[i]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int [] price={7,6,4,3,1};
        int profit=Maxprofit(price);
        System.out.println(profit);
    }
}
