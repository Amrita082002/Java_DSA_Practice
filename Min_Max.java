package arrays;

import java.util.*;

public class Min_Max {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];

for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
int min=Integer.MAX_VALUE;
int max=Integer.MIN_VALUE;

for(int i=0;i<n;i++) {
	if(arr[i]<min) {
		min=arr[i];
		
	}
}
for(int i=0;i<n;i++) {
	if(arr[i]>max) {
		max=arr[i];
		
	}
}

System.out.println("Minumum element is"+min);
System.out.println("Maximum element is"+max);

}
}


