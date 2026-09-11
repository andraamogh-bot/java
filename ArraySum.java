public class ArraySum {
    static int sum(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + sum(arr, n - 1);
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println("Sum = " + sum(arr, arr.length));
    }
}
