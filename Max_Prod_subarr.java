package arrays;

import java.util.Scanner;

public class Max_Prod_subarr {

    static int maxProduct(int[] arr) {

        int prefix = 1;
        int suffix = 1;
        int ans = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (prefix == 0)
                prefix = 1;

            if (suffix == 0)
                suffix = 1;

            prefix = prefix * arr[i];
            suffix = suffix * arr[n - i - 1];

            ans = Math.max(ans, Math.max(prefix, suffix));
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = maxProduct(arr);

        System.out.println("Maximum Product Subarray: " + result);

        sc.close();
    }
}
