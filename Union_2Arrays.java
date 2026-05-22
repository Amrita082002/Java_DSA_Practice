package arrays;
import java.util.*;

public class Union_2Arrays {

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

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        // For union
        HashSet<Integer> unionSet = new HashSet<>();

        for(int i = 0; i < n; i++) {
            unionSet.add(a[i]);
        }

        for(int j = 0; j < m; j++) {
            unionSet.add(b[j]);
        }

        // For intersection
        HashSet<Integer> intersection = new HashSet<>();

        for(int j = 0; j < m; j++) {

            if(set.contains(b[j])) {
                intersection.add(b[j]);
            }
        }

        
        ArrayList<Integer> unionList = new ArrayList<>(unionSet);

        ArrayList<Integer> intersectionList = new ArrayList<>(intersection);

        Collections.sort(unionList);
        Collections.sort(intersectionList);

        System.out.println("Union: " + unionList);
        System.out.println("Intersection: " + intersectionList);

        sc.close();
    }
}
