package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Median_of_two_arrays_diffsize {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    
	int[] a=new int[n];
	
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	
	int m=sc.nextInt();
	
	int[] b=new int[m];
	
	for(int i=0;i<m;i++) {
		b[i]=sc.nextInt();
	}
	
	int[] c=new int[n+m];
	
	for(int i=0;i<n;i++) {
		c[i]=a[i];
	}
	for(int i=0;i<m;i++) {
		c[n+i]=b[i];
	}
	
	int k=c.length;
	
	Arrays.sort(c);
	
	if(k%2==0) {
		System.out.print(c[k/2]+(c[k/2]-1)/2.0);
	}
	else {
		System.out.print(c[k/2]);
	}
	
	
}
}
