import java.util.Arrays;

public class lc1356 {
    public static void main(String[] args) {
        int[] t={0,1,2,3,4,5,6,7,8};
        int[] res= res(t);
        for(int i:res){
            System.out.println(i);
        }
    }
    static int[] res(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // Shift the bit count 16 places to the left, then add the original number
            arr[i] = (Integer.bitCount(arr[i]) << 16) | arr[i];
        }

        // Step 2: Sort the primitive array directly
        // Because the bit count is in the higher bits, it naturally acts as the primary sort.
        // If bit counts are tied, the lower 16 bits (original number) act as the tie-breaker.
        Arrays.sort(arr);

        // Step 3: Decode the numbers back to their original values
        for (int i = 0; i < arr.length; i++) {
            // Use bitwise AND with 0xFFFF (which is 1111111111111111 in binary)
            // to wipe out the bit count and keep only the original number
            arr[i] = arr[i] & 0xFFFF;
        }

        return arr;
    }
}
