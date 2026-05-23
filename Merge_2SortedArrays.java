package arrays;

import java.util.*;

public class Merge_2SortedArrays
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for(int j = 0; j < m; j++) {
            b[j] = sc.nextInt();
        }

        int left = n - 1;
        int right = 0;

        while(left >= 0 && right < m) {

            if(a[left] > b[right]) {

                int temp = a[left];
                a[left] = b[right];
                b[right] = temp;

                left--;
                right++;
            }
            else {
                break;
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        for(int j = 0; j < m; j++) {
            System.out.print(b[j] + " ");
        }
    }
}