package arrays;

import java.util.*;

public class Median_of_Two_Sorted_Arrays {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    
	int[] a=new int[n];
	int[] b=new int[n];
	
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		b[i]=sc.nextInt();
	}
	
	int[] c=new int[2*n];
	
	for(int i=0;i<n;i++) {
		c[i]=a[i];
	}
	for(int i=0;i<n;i++) {
		c[n+i]=b[i];
	}
	
	Arrays.sort(c);
	System.out.print((c[n]+c[n-1])/2.0);
	
	
}
}
