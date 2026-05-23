package arrays;

import java.util.*;

public class FindCommonin3SortedArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] a = new int[n1];

        for(int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] b = new int[n2];

        for(int j = 0; j < n2; j++) {
            b[j] = sc.nextInt();
        }

        int n3 = sc.nextInt();
        int[] c = new int[n3];

        for(int k = 0; k < n3; k++) {
            c[k] = sc.nextInt();
        }

        int i = 0;
        int j = 0;
        int k = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while(i < a.length && j < b.length && k < c.length) {

            if(a[i] == b[j] && b[j] == c[k]) {

                list.add(a[i]);

                i++;
                j++;
                k++;
            }
            else if(a[i] < b[j]) {
                i++;
            }
            else if(b[j] < c[k]) {
                j++;
            }
            else {
                k++;
            }
        }

        System.out.print(list);
    }
}