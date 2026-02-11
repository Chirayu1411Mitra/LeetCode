import java.util.Arrays;

public class missingObservations {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result = missing(arr, 6, 4);
        for (int i : result) {
            System.out.println(i);

        }
    }

    static int[] missing(int[] arr, int mean, int n) {
        int[] temp = new int[n];
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int mis = mean * (n + arr.length) - sum;
        System.out.println(mis);
        if (mis > n * 6|| mis < n) {
            return new int[0];
        }
        int t = mis / n;
        int r = mis % n;
        if (mis % n == 0) {
            for (int i = 0; i < temp.length; i++) {
                temp[i] = t;
            }
        } else {
            Arrays.fill(temp, t);
            for (int i = 0; i < r; i++) {
                temp[i]++;
            }
        }
        return temp;

    }
}

