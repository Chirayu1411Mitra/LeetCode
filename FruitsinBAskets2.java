import java.util.ArrayList;

public class FruitsinBAskets2 {
    static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : baskets){
            list.add(i);
        }
        int temp=0;
        for(int i = 0;i<fruits.length;i++){
            boolean placed= false;
            for(int j=0;j<list.size();j++){
                if(fruits[i]<=list.get(j)){
                    list.remove(j);
                    placed=true;
                    break;
                }
            }
            if(!placed){
                temp++;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] fruits={6,5};
        int[] baskets={3,5};
        int num= numOfUnplacedFruits(fruits,baskets);
        System.out.println(num);
    }
}
