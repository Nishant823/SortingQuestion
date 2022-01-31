package sortingnew;
import java.util.Scanner;

public class KadanesAlgorithmToFindMaximumSubArray {
	public static int maxSubArray(int[] arr,int n)
	{
		int max_so_far=Integer.MIN_VALUE;
		int max_ending_here=0;
		for(int i=0;i<n;i++)
		{
			max_ending_here=max_ending_here+arr[i];
			if(max_ending_here>max_so_far)
			{
				max_so_far=max_ending_here;
			}
			if(max_ending_here<0)
			{
				max_ending_here=0;
			}
		}
		return max_so_far;
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
		int max_subarray_sum=maxSubArray(arr,n);
		System.out.println("The sub array than have maximum sum: "+max_subarray_sum);
		sc.close();

	}

}
