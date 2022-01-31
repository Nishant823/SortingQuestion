package sortingnew;
import java.util.Scanner;
import java.util.Arrays;

public class MinimizingMaxDifferenceBetweenHeight {
	public static void print(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void minimizeDifferece(int[]arr,int n,int k)
	{
		Arrays.sort(arr);
		int maxDiff=arr[n-1]-arr[0];
		int largest=arr[n-1]-k;
		int smallest=arr[0]+k;
		for(int i=1;i<=n-1;i++)
		{
			int max=Math.max(largest,arr[i-1]+k);
			int min=Math.min(smallest,arr[i]-k);
			
			maxDiff=Math.min(maxDiff,max-min);	
		}
		System.out.println("The maximum differece is: "+maxDiff);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element in an array");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the number by which to decrese the height: ");
		int k=sc.nextInt();
		minimizeDifferece(arr,n,k);
		
		sc.close();

	}

}
