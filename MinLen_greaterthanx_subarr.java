package arrays;

import java.util.*;

public class MinLen_greaterthanx_subarr {

    public static int smallestSubWithSum(int x, int[] arr) {

        int start = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int end = 0; end < arr.length; end++) {

            sum += arr[end];

            while (sum > x) {

                minLen = Math.min(minLen, end - start + 1);

                sum -= arr[start];
                start++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int x = sc.nextInt();

        int result = smallestSubWithSum(x, arr);

        System.out.println("Smallest subarray length: " + result);

        sc.close();
    }
}