public class Maximum {
    static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int max = findMax(arr, n - 1);
        if (arr[n - 1] > max) {
            return arr[n - 1];
        }
        return max;    
    }
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 45, 30};
        System.out.println("Maximum = " + findMax(arr, arr.length));
        
    }
}
