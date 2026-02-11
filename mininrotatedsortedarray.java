public class mininrotatedsortedarray {
    static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + ((end - start) / 2);
            if (nums[end] < nums[mid]) {
                start += 1;
            } else if (nums[mid] < nums[end]) {
                end = mid;
            } else {
                end--;
            }


        }
        return nums[start];


    }

    public static void main(String[] args) {
        int[] num={2,2,2,2,2,2,2,2,2,2,2,0,1,2};
        int temp = findMin(num);
        System.out.println(temp);
    }
}
