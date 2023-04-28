package Hashing;
import java.util.*;

public class InterSectionOfArrays {
	
	private static int[] intersectionOfTw(int[] arr1, int[] arr2) {
		Set<Integer> set=new HashSet<>();
		int count=0;
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		Set<Integer> res=new HashSet<Integer>();
		for(int i=0;i<arr2.length;i++) {
			if(set.contains(arr2[i])) {
				count++;
				res.add(arr2[i]);
				
			}
		}
		int[] result=new int[res.size()];
		int i=0;
		for(int j:res) {
			result[i]=j;
			i++;
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		int[] arr1= {7,3,9};
		int[] arr2= {6,3,9,2,9,4};
		int[] arr=intersectionOfTw(arr1,arr2);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}


}
