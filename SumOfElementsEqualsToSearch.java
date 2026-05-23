package arrays;

import java.util.*;

public class SumOfElementsEqualsToSearch {

    static void generateSubarrays(int[] arr) {

        for(int i = 0; i < arr.length; i++) {

            int sum = 0;

            for(int j = i; j < arr.length; j++) {

                sum += arr[j];

                if(sum == 0) {
                    System.out.print("true");
                    return;
                }
            }
        }

        System.out.print("false");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        generateSubarrays(arr);
    }
}