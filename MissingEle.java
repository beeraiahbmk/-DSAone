package searching;

public class MissingEle {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5};
		int n=arr.length;
		int temp[]=new int[n+1];
		for(int i=0;i<=n;i++) {
			temp[i]=0;
		}
		
		for(int i=0;i<n;i++) {
			 temp[arr[i]-1]=1;
		}
//		for(int i=0;i<temp.length;i++) {
//			System.out.print(temp[i]+" ");
//		}
		int ans=0;
		for(int i=0;i<=n;i++) {
			if(temp[i]==0) {
				ans=i+1;
			}
		}
		System.out.println(ans);
		

	}

}
