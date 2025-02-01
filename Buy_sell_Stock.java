import java.util.Scanner;
import java.util.Arrays;

public class Buy_sell_Stock{
 	public static void main(String[] args){
	int [] arr={7,1,5,3,6,4};
	int max=max(arr);
System.out.println(max);
}
	static int max(int [] arr){
	int min=Integer.MAX_VALUE;
	int profit=0;
	for(int i=0;i<arr.length;i++){
	if(arr[i]<min){
	min=arr[i];
	}
	else{
	profit=Math.max(profit,arr[i]-min);
}
}
return profit;
	} 

}
