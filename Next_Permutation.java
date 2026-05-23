package arrays;

import java.util.*;

public class Next_Permutation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ind1 = -1;
        int ind2 = -1;

        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                ind1 = i;
                break;
            }
        }

        if(ind1 == -1) {
            reverse(nums, 0);
        }
        else {

            for(int i = nums.length - 1; i >= 0; i--) {
                if(nums[i] > nums[ind1]) {
                    ind2 = i;
                    break;
                }
            }

            swap(nums, ind1, ind2);
            reverse(nums, ind1 + 1);
        }

        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void reverse(int[] nums, int start) {

        int i = start;
        int j = nums.length - 1;

        while(i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
