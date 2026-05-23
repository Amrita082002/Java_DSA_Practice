package arrays;

import java.util.*;

public class No_of_jumps {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if(n == 1) {
            System.out.println(0);
            return;
        }

        if(arr[0] == 0) {
            System.out.println(-1);
            return;
        }

        int jumps = 1;
        int maxReach = arr[0];
        int steps = arr[0];

        for(int i = 1; i < n; i++) {

            if(i == n - 1) {
                System.out.println(jumps);
                return;
            }

            maxReach = Math.max(maxReach, i + arr[i]);

            steps--;

            if(steps == 0) {

                jumps++;

                if(i >= maxReach) {
                    System.out.println(-1);
                    return;
                }

                steps = maxReach - i;
            }
        }

        System.out.println(-1);
    }
}