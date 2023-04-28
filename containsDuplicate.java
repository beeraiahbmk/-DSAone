package Array;

import java.util.Arrays;

public class containsDuplicate {
	private static boolean containsDuplicates(int[] arr,int n) {
		Arrays.sort(arr);
		boolean flag=false;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]){
				flag=true;
			};
		}
		return flag;
		
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,1};
		int n=arr.length;
		System.out.println(containsDuplicates(arr,n));

	}

}
