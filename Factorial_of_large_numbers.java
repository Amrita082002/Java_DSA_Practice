package arrays;

import java.util.*;
import java.math.BigInteger;

public class Factorial_of_large_numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        BigInteger ans = BigInteger.ONE;

        for(int i = 1; i <= n; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }

        String str = ans.toString();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i) - '0');
        }

        System.out.println(list);
    }
}