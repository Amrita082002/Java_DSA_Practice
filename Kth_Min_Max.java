package arrays;

import java.util.*;

public class Kth_Min_Max {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	int[] arr=new int[n];
	
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	
	int k=sc.nextInt();
	
	Arrays.sort(arr);
	
	System.out.println("K-th min element is "+ arr[k-1]);
	System.out.println("K-th max element is "+ arr[n-k]);
	
	sc.close();
	
}

}
