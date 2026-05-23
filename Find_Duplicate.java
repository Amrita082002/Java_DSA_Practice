package arrays;

import java.util.*;

public class Find_Duplicate
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        int duplicate = -1;

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i + 1] == nums[i]) {
                duplicate = nums[i + 1];
                break;
            }
        }

        System.out.println(duplicate);
    }
}