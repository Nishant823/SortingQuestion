package sortingnew;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumDifferenceOptimized {
	public static int minimumDifference(int[] arr)
	{
		//but it can also be done in O(b+n) ans O(max of(n,b);
		int res=Integer.MAX_VALUE;
		Arrays.sort(arr);//this might take O(nlogn) and O(logn) auxilary space
		for(int i=1;i<arr.length;i++)
		{
			res=Math.min(res,(arr[i]-arr[i-1]));
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int res=minimumDifference(arr);
		System.out.println("The minimum difference in an array is :"+res);
		sc.close();

	}

}
