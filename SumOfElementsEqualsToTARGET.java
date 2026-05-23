package arrays;

import java.util.*;

public class SumOfElementsEqualsToTARGET {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int search = sc.nextInt();

        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {

                if(arr[i] + arr[j] == search) {

                    System.out.print("[" + arr[i] + "," + arr[j] + "]");
                }
            }
        }
    }
}
