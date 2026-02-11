import java.util.Arrays;

public class findsmallerstgreaterthentarget {
    public static void main(String[] args) {
        char[] arr = {'a','c','d','e','f','g'};
        char c = greater(arr, 'b');
        System.out.println(c);
        int[][] dp = new int[3][3];
        for (int[] row : dp) {
            Arrays.fill(row, 1);
        }
    }

    static char greater(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (end >= start) {
            int mid = start + ((end - start) / 2);
            if (letters[mid]<target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if(start==letters.length) return letters[0];
        else return letters[start];
    }
}
