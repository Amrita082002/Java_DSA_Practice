
//Sliding Window technique

package arrays;

import java.util.*;
public class Chocolate_distribution {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	int[] arr=new int[n];
	
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	
	int k=sc.nextInt();
	
	int res=Integer.MAX_VALUE;
	
	Arrays.sort(arr);
	
	for(int i=0;i<n-k+1;i++) {
		int minResult=arr[i];
		int maxResult=arr[i+k-1];
		res=Math.min(res, maxResult-minResult);
	}
	System.out.print(res);
	
	
}
}
