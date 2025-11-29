package basics;

import java.util.Scanner;

public class FindMissingNo {
	public static int findmissing(int arr[],int n) {
//		int totalsum = n*(n+1)/2;
//		int arraysum=0;
//		
//		for(int x: arr) {
//			arraysum=+x;
//		}
//		return totalsum-arraysum;
		for(int i=1;i<=n;i++) {
			
			boolean found = false;
			
			for(int x:arr) {
				if(x == i) {
					found = true;
					break;
				}
			}
//			if(!found) {
//				return i;
//			}
		}
		return -1;
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("enter elements of an array: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
     
		System.out.println(findmissing(arr, n));

	}

}
