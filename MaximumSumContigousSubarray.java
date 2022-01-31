package sortingnew;
import java.util.Scanner;

public class MaximumSumContigousSubarray {
	public static int sumArray(int[] arr)
	{
		int max_sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int sum=0;
				for(int k=i;k<=j;k++)
				{
					sum=sum+arr[k];
					
				}
				max_sum=Math.max(max_sum, sum);
					
			}
		}
		return max_sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element in an array: ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=sumArray(arr);
		System.out.println("the maximum sum in an array is :"+ sum);
		sc.close();

	}

}
