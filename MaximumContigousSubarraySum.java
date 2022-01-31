package sortingnew;
import java.util.Scanner;

public class MaximumContigousSubarraySum {
	public static int maxSumArray(int[]arr,int n)
	{
		int max_sum=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=i;j<n;j++)
			{
				sum=sum+arr[j];
				max_sum=Math.max(max_sum, sum);
			}
		}
		return max_sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element in an array: ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max_sum=maxSumArray(arr,n);
		System.out.println("the maximum sum in an array is "+max_sum);
		sc.close();

	}

}
