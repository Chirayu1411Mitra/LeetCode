import java.util.ArrayList;
import java.util.List;
public class kid_with_greatest_candies{
public static void main(String[] args){
	List<Boolean> list =new ArrayList<>();
	int[] candies={2,3,5,1,3};
	int extra=3;
	list=kidswithcandies(candies,extra);
	System.out.println(list);
	

	
	
}
static List<Boolean> kidswithcandies(int [] candies,int extra){
	List<Boolean> list=new ArrayList<>();
		int max=max(candies);
		for(int i=0;i<candies.length;i++){
			if(max<=candies[i]+extra){
				list.add(true);
			}
			else{
			list.add(false);
			}
			
		}
		return list;
}
static int max(int [] candies){
		int max=0;
		for(int i=0;i<candies.length;i++){
			if(candies[i]>max){
				max=candies[i];
			}
		}
		return max;
}

}

