public class sumof2nozeroint {
    static int[] getNoZeroIntegers(int n) {
        int[] arr = new int[2];
        int count = 1;
        int temp = n-1;
        while (containszero(temp)) {
                temp--;
                count++;
            }

        arr[0] = count;
        arr[1] = temp;
        return arr;
    }

    ;

    static boolean containszero(int n) {
        while (n>0) {
            int temp = n % 10;
            n = n / 10;
            if (temp == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = getNoZeroIntegers(1000);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
