public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 3;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }

    static int getLongestSubarray(int[] a, long k) {
        int n = a.length;
        int len = 0;
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum += a[j];
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }
}

