public class waterBottle {
    static int numWaterBottles(int numBottles, int numExchange) {
        int result = numBottles;
        int empty= numBottles;
        int count=0;
        while(empty>=numExchange) {
            empty=empty-numExchange;
            numExchange++;
            count++;
            empty++;
        }

        return result+count;
    }

    public static void main(String[] args) {
        int result=numWaterBottles(20,3);
        System.out.println(result);
    }
}
