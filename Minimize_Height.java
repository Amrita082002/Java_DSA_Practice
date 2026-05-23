package arrays;
import java.util.*;

public class Minimize_Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int k = sc.nextInt();

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if(n == 1) {
            System.out.println(0);
            return;
        }

        Arrays.sort(arr);

        int answer = arr[n - 1] - arr[0];

        for(int i = 0; i < n - 1; i++) {

            int min = Math.min(arr[0] + k, arr[i + 1] - k);
            int max = Math.max(arr[n - 1] - k, arr[i] + k);

            if(min < 0)
                continue;

            answer = Math.min(answer, max - min);
        }

        System.out.println(answer);
    }
}
