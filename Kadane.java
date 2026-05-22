package arrays;
import java.util.*;

public class Kadane {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	
	int maxSum=arr[0];
	int currentSum=0;
	
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	
	for(int i=0;i<n;i++) {
		currentSum+=arr[i];
		
		if(currentSum>maxSum) {
			maxSum=currentSum;
		}
		
		if(currentSum<0) {
			currentSum=0;
		}
		
	}
	
	System.out.println(maxSum);
	
	
}
	
}
