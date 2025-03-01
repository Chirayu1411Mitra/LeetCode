public class Applyoperationstoarray{
	public static void main(String[] args){
		int[] nums={1,1,2,2,4,0,4};
		Applyoperations(nums);
		for(int i=0;i<nums.length;i++){
	System.out.println(nums[i]);
	}
	}
	static int[] Applyoperations(int [] nums){
	for(int i=0;i<nums.length;i++){
		if(nums[i]==0){
			break;
		}
	if(nums[i]==nums[i+1]){
		nums[i]=nums[i]+nums[i+1];
		nums[i+1]=0;
	}

	}
	movezero(nums);
	return nums;

	}
	static void movezero(int [] arr){
	int pos=0;
	for(int i=0;i<arr.length;i++){
		if(arr[i]!=0){
			int temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;

			pos++;
		}
		}
	}
}


