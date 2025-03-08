import java.util.List;
import java.util.ArrayList;
public class move_zeros{
	public static void main(String[] args){
	int [] nums={0,6,3,6,0,7,8,0};
	movezeros(nums);

	}
	static void movezeros(int [] nums){
	List<Integer> list=new ArrayList<>();
	int count=0;
	for (int i =0;i<nums.length;i++){
	if(nums[i]!=0){
		list.add(nums[i]);
	}
	else{
	count++;
	}
	}
	for (int i=0;i<count;i++){
		list.add(0);
	}
	System.out.println(list);

	}
}

